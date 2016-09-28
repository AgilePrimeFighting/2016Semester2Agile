package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.weight.model.Weight;
import com.prime.weight.service.WeightService;

@Controller
@Scope("request")
public class ViewQuestionsBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());

    private List<Question> questions;
    private List<RangeItem> rangeList;
    Map<Integer, HashMap<Integer, Weight>> weightMap = new HashMap<Integer, HashMap<Integer, Weight>>();
    private List<Product> products;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private ProductService productService;

    @PostConstruct
    public void init() {
        logger.info("initiating");
        products = productService.listAll();
        setRangeList(new ArrayList<RangeItem>());

        if (questionService != null) {
            questions = questionService.listAll();
        } else {
            logger.info("question service is null");
        }

        for (Question question : questions) {
            for (Option option : question.getOptions()) {
                List<Weight> weightList = option.getWeightList();
                int min = minWeight(weightList);
                int max = maxWeight(weightList);
                for (Weight weight : weightList) {
                    Product product = weight.getProduct();
                    RangeItem range = new RangeItem(product.getProductName(), min, max, product.isProductActive() + "");
                    rangeList.add(range);
                }
            }
        }

        for (Question question : questions) {
            for (Option option : question.getOptions()) {
                HashMap<Integer, Weight> productIdToWeightMap = new HashMap<Integer, Weight>();
                weightMap.put(option.getOptionId(), productIdToWeightMap);
                for (Weight weight : option.getWeightList()) {
                    productIdToWeightMap.put(weight.getProductId(), weight);
                }
            }
        }

    }

    private int minWeight(List<Weight> weightList) {
        if (weightList == null || weightList.isEmpty()) return 0;
        int min = weightList.get(0).getWeightValue();
        for (int i = 1; i < weightList.size(); i++) {
            Weight w = weightList.get(i);
            if (w.getWeightValue() < min) min = w.getWeightId();
        }
        return min;
    }

    private int maxWeight(List<Weight> weightList) {
        if (weightList == null || weightList.isEmpty()) return 0;
        int max = weightList.get(0).getWeightValue();
        for (int i = 1; i < weightList.size(); i++) {
            Weight w = weightList.get(i);
            if (w.getWeightValue() > max) max = w.getWeightId();
        }
        return max;
    }

    public Weight findWeight(Integer optionId, Integer productId) {
        Weight weight = weightMap.get(optionId).get(productId);
        return weight;
    }

    public void onDelete(Question question) {
        logger.info("deleting question");
        questions.remove(question);
        questionService.delete(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public QuestionService getQuestionService() {
        return questionService;
    }

    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    public List<RangeItem> getRangeList() {
        return rangeList;
    }

    public void setRangeList(List<RangeItem> rangeList) {
        this.rangeList = rangeList;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}