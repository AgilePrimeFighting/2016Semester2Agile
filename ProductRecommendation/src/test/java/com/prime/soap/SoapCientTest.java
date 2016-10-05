package com.prime.soap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-config-soap.xml")
public class SoapCientTest {
	
	//@Autowired
	//private SoapClient client;
	
	@Test
	public void testLogin(){
	//	client.login();
	}

}
