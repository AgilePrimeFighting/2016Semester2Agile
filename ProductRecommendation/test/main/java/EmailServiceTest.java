package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prime.customer.model.Customer;
import com.prime.email.service.EmailService;
import com.prime.response.model.Response;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-config.xml")
public class EmailServiceTest {

	private static final Logger logger = Logger.getLogger(EmailServiceTest.class.getName());
	
	@Autowired
	private EmailService emailService;
	

	@Test
	public void testOrderService() {
		logger.info("test");
		emailService.sendMail("myob.prime.info@gmail.com",
	    		   "tliu861@aucklanduni.ac.nz",
	    		   "Testing123",
	    		   "test message");
	}
	
	@Test
	public void testFormatMessage(){
		
		  Customer customer = new Customer();
		    customer.setFirstName("Jogn");
		    customer.setLastName("Smith");
		    List<Response> allResponses = new ArrayList<Response>();
		    Response response = new Response();
		    response.setQuestionId(1);
		    response.setQuestionBody("why why?");
		    response.setAnswer("Don't know");
		    allResponses.add(response);
		    
		    Response response2 = new Response();
		    response2.setQuestionId(2);
		    response2.setQuestionBody("why why22?");
		    response2.setAnswer("Don't know2");
		    allResponses.add(response2);
		    
		    
		logger.info(emailService.formatCustomerResponseEmail(customer, allResponses));
	}
	
	@Test
	public void testSendCustomerResponseEmail(){
		 Customer customer = new Customer();
		    customer.setFirstName("Jogn");
		    customer.setLastName("Smith");
		    customer.setAddiMsg("hey, i would like to be called instead of emailed");
		    customer.setBusinessType("Cattle raising");
		    customer.setCompany("Pepperidge Farm");
		    customer.setCountry("New Zealand");
		    customer.setHasTrial("No");
		    customer.setIsSubscribe(false);
		    customer.setProduct("MYOB EXO");
		    customer.setEmail("pepperidge.farm@gmail.com");
		    //customer.set
		    List<Response> allResponses = new ArrayList<Response>();
		    Response response = new Response();
		    response.setQuestionId(1);
		    response.setQuestionBody("why why?");
		    response.setAnswer("Don't know");
		    allResponses.add(response);
		    
		    Response response2 = new Response();
		    response2.setQuestionId(2);
		    response2.setQuestionBody("why why22?");
		    response2.setAnswer("Don't know2");
		    allResponses.add(response2);
		    
		    emailService.sendCustomerResponseEmail(customer, allResponses);
	}
}
