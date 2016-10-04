package com.prime.product;

import com.prime.product.model.Product;
import com.prime.response.model.Response;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.faces.context.FacesContext;
import java.util.List;

@Controller
@Scope("session")
public class PreviewRecommendedProductBean {

    private Product product;

    private List<Response> responses;

    public Product getProduct() {
        return product;
    }

    public void initPreview(Product product) {
        this.product = product;
    }

    public void doRegister(){

    }

}
