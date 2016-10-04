package com.prime.soap;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpServletConnection;

import com.prime.wsdl.ArrayOfCommand;
import com.prime.wsdl.Command;
import com.prime.wsdl.Login;
import com.prime.wsdl.LoginResponse;
import com.prime.wsdl.Logout;
import com.prime.wsdl.SM201010Content;
import com.prime.wsdl.SM201010GetSchema;
import com.prime.wsdl.SM201010GetSchemaResponse;
import com.prime.wsdl.SM201010Submit;
import com.prime.wsdl.SM201010SubmitResponse;
import com.prime.wsdl.SetLocaleName;

@Service
public class SoapClient extends WebServiceGatewaySupport{

	private static final Logger logger = LoggerFactory.getLogger( SoapClient.class );

	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.prime.wsdl");
		this.setDefaultUri("https://try.myobadvanced.com/Soap/PROVENG.asmx");
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
		CommonsHttpMessageSender messageSender = new CommonsHttpMessageSender();
		try {
			messageSender.createConnection(new URI("https://try.myobadvanced.com/Soap/PROVENG.asmx"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getWebServiceTemplate().setMessageSender(messageSender);
		//this.getWebServiceTemplate().getMessageSenders()
	}
	public void login() {
		logger.trace("login");
		Login login = new Login();
		login.setName("MYOB@prime");
		login.setPassword("n0kbFAgA");

		LoginResponse response = (LoginResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						login
						);
		
		SM201010GetSchema submit = new  SM201010GetSchema();
		ArrayOfCommand commands = new ArrayOfCommand();
		
		//submit.setCommands(commands);
		Command command = new Command();
		commands.getCommand().add(command);
		command.setValue("tliu8123");
		command.setFieldName("Login");
		
		SM201010GetSchema getSchema = new SM201010GetSchema();
		Logout logout = new Logout();
		
		SetLocaleName set = new SetLocaleName();
		set.setLocaleName("fr-CA");
		getWebServiceTemplate()
				.marshalSendAndReceive(
						getSchema
						);
		getWebServiceTemplate()
		.marshalSendAndReceive(
				
				logout
				);
		//content.
		//command.set

		//return response;
	}
}
