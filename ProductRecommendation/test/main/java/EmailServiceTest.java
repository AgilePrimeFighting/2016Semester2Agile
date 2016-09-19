package main.java;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prime.email.service.EmailService;


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
	    		   "Testing only \n\n Hello Spring Email Sender");
	}
	
	@Test
	public void testFormatMessage(){
		logger.info(emailService.formatMessage());
	}
}
