package main.java;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-config.xml")
public class EmailServiceTest {

	private static final Logger logger = Logger.getLogger(EmailServiceTest.class.getName());

	@Test
	public void testOrderService() {
		logger.info("test");
	}
}
