package com.prime.soap;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.prime.wsdl.Login;
import com.prime.wsdl.LoginResponse;

@Service
public class SoapClient extends WebServiceGatewaySupport{

	private static final Logger logger = LoggerFactory.getLogger( SoapClient.class );

	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.prime.wsdl");
		this.setDefaultUri("https://try.myobadvanced.com/Soap/");
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}
	public void login() {
		logger.trace("login");
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.prime.wsdl");
		this.setDefaultUri("https://try.myobadvanced.com/Soap/");
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
		Login request = new Login();
		request.setName("MYOB@prime");
		request.setPassword("n0kbFAgA");


		LoginResponse response = (LoginResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						"https://try.myobadvanced.com/Soap/PROVENG.asmx",
						request
						);

		//return response;
	}
}
