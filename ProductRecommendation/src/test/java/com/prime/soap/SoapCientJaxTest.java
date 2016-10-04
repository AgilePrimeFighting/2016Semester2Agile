package com.prime.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-config-soap.xml")
public class SoapCientJaxTest {
	private static final Logger logger = LogManager.getLogger(SoapCientJaxTest.class);
	
	@Autowired
	private SoapClientJax client;
	
	@Test
	public void testLogin(){
		client.login();
	}

}
