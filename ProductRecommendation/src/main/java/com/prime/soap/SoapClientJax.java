package com.prime.soap;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.prime.jax.ArrayOfCommand;
import com.prime.jax.Command;
import com.prime.jax.Key;
import com.prime.jax.LoginResult;
import com.prime.jax.SM201010Content;
import com.prime.jax.Screen;
import com.prime.jax.ScreenSoap;
import com.prime.jax.Value;
import com.prime.jax.sm507000.Content;

@Service
public class SoapClientJax {
	private static final Logger logger = LogManager.getLogger(SoapClientJax.class);
	
	
	@PostConstruct
	public void init(){
		logger.info("init");
	}
	@Async
	public void login(){
		try{
		Screen screen = new Screen();
		ScreenSoap screenSoap = screen.getScreenSoap();
		LoginResult loginResult = screenSoap.login("MYOB@prime", "n0kbFAgA");
		//LoginResult loginResult = screenSoap.login("api@api", "Qianer1006!");
		Map<String, List<String>> headers = (Map<String, List<String>>)((BindingProvider)screenSoap).getResponseContext().get(MessageContext.HTTP_RESPONSE_HEADERS);
		 List<String> setCookie = headers.get("Set-Cookie");
		((BindingProvider)screenSoap).getRequestContext().put(
	            MessageContext.HTTP_REQUEST_HEADERS,
	                Collections.singletonMap("Cookie", setCookie
	            )
	        );
		SM201010Content sM201010Content = screenSoap.sm201010GetSchema();
		Value loginNameValue = new Value();
		loginNameValue.setValue("logintest9");
		loginNameValue.setLinkedCommand(sM201010Content.getUserInformation().getLogin());
		Value emailValue = new Value();
		emailValue.setValue("tliu861@aucklanduni.ac.nz");
		emailValue.setLinkedCommand(sM201010Content.getUserInformation().getEmail());
		
		Key roleNameKey = new Key();
		roleNameKey.setValue("='Management'");
		roleNameKey.setFieldName(sM201010Content.getRoles().getRoleName().getFieldName());
		roleNameKey.setObjectName(sM201010Content.getRoles().getRoleName().getObjectName());
		Value roleValue = new Value();
		roleValue.setValue("True");
		roleValue.setLinkedCommand(sM201010Content.getRoles().getSelected());
		roleValue.getLinkedCommand().setLinkedCommand(roleNameKey);
		roleValue.setCommit(true);
		
		Key licenceTypeKey = new Key();
		licenceTypeKey.setValue("='Full User'");
		licenceTypeKey.setFieldName(sM201010Content.getLicenseTypes().getLicenseType().getFieldName());
		licenceTypeKey.setObjectName(sM201010Content.getLicenseTypes().getLicenseType().getObjectName());
		Value licenseTypeValue = new Value();
		licenseTypeValue.setValue("True");
		licenseTypeValue.setLinkedCommand(sM201010Content.getLicenseTypes().getSelected());
		licenseTypeValue.getLinkedCommand().setLinkedCommand(licenceTypeKey);
		licenseTypeValue.setCommit(true);
		Command saveAction = sM201010Content.getActions().getSaveUsers();
		
	
		ArrayOfCommand commands = new ArrayOfCommand();
		commands.getCommand().add(loginNameValue);
		commands.getCommand().add(emailValue);
		commands.getCommand().add(roleValue);
		commands.getCommand().add(licenseTypeValue);
		commands.getCommand().add(saveAction);
		screenSoap.sm201010Submit(commands);
		
		com.prime.jax.sm507000.Screen screen507000 = new com.prime.jax.sm507000.Screen();
		com.prime.jax.sm507000.ScreenSoap screenSoap507000 = screen507000.getScreenSoap();
		
		((BindingProvider)screenSoap507000).getRequestContext().put(
	            MessageContext.HTTP_REQUEST_HEADERS,
	                Collections.singletonMap("Cookie", setCookie
	            )
	        );
		Content content = screenSoap507000.getSchema() ;
		com.prime.jax.sm507000.ArrayOfCommand commands507000 = new com.prime.jax.sm507000.ArrayOfCommand();
		com.prime.jax.sm507000.Command processEmailAction = content.getActions().getProcessAll();
		commands507000.getCommand().add(processEmailAction);
		screenSoap507000.submit(commands507000);
		screenSoap.logout();
		}
		catch(Exception e){
			logger.error(e);
		}
		logger.info("done");
	}
	
	@Async
	public void createTrialUser(String email){
		logger.info("starting trial provisioning for " + email);
		try{
		Screen screen = new Screen();
		ScreenSoap screenSoap = screen.getScreenSoap();
		LoginResult loginResult = screenSoap.login("MYOB@prime", "n0kbFAgA");
		Map<String, List<String>> headers = (Map<String, List<String>>)((BindingProvider)screenSoap).getResponseContext().get(MessageContext.HTTP_RESPONSE_HEADERS);
		 List<String> setCookie = headers.get("Set-Cookie");
		((BindingProvider)screenSoap).getRequestContext().put(
	            MessageContext.HTTP_REQUEST_HEADERS,
	                Collections.singletonMap("Cookie", setCookie
	            )
	        );
		SM201010Content sM201010Content = screenSoap.sm201010GetSchema();
		Value loginNameValue = new Value();
		loginNameValue.setValue(email);
		loginNameValue.setLinkedCommand(sM201010Content.getUserInformation().getLogin());
		Value emailValue = new Value();
		emailValue.setValue(email);
		emailValue.setLinkedCommand(sM201010Content.getUserInformation().getEmail());
		
		Key roleNameKey = new Key();
		roleNameKey.setValue("='Management'");
		roleNameKey.setFieldName(sM201010Content.getRoles().getRoleName().getFieldName());
		roleNameKey.setObjectName(sM201010Content.getRoles().getRoleName().getObjectName());
		Value roleValue = new Value();
		roleValue.setValue("True");
		roleValue.setLinkedCommand(sM201010Content.getRoles().getSelected());
		roleValue.getLinkedCommand().setLinkedCommand(roleNameKey);
		roleValue.setCommit(true);
		
		Key licenceTypeKey = new Key();
		licenceTypeKey.setValue("='Full User'");
		licenceTypeKey.setFieldName(sM201010Content.getLicenseTypes().getLicenseType().getFieldName());
		licenceTypeKey.setObjectName(sM201010Content.getLicenseTypes().getLicenseType().getObjectName());
		Value licenseTypeValue = new Value();
		licenseTypeValue.setValue("True");
		licenseTypeValue.setLinkedCommand(sM201010Content.getLicenseTypes().getSelected());
		licenseTypeValue.getLinkedCommand().setLinkedCommand(licenceTypeKey);
		licenseTypeValue.setCommit(true);
		Command saveAction = sM201010Content.getActions().getSaveUsers();
		
	
		ArrayOfCommand commands = new ArrayOfCommand();
		commands.getCommand().add(loginNameValue);
		commands.getCommand().add(emailValue);
		commands.getCommand().add(roleValue);
		commands.getCommand().add(licenseTypeValue);
		commands.getCommand().add(saveAction);
		screenSoap.sm201010Submit(commands);
		
		com.prime.jax.sm507000.Screen screen507000 = new com.prime.jax.sm507000.Screen();
		com.prime.jax.sm507000.ScreenSoap screenSoap507000 = screen507000.getScreenSoap();
		
		((BindingProvider)screenSoap507000).getRequestContext().put(
	            MessageContext.HTTP_REQUEST_HEADERS,
	                Collections.singletonMap("Cookie", setCookie
	            )
	        );
		Content content = screenSoap507000.getSchema() ;
		com.prime.jax.sm507000.ArrayOfCommand commands507000 = new com.prime.jax.sm507000.ArrayOfCommand();
		com.prime.jax.sm507000.Command processEmailAction = content.getActions().getProcessAll();
		commands507000.getCommand().add(processEmailAction);
		screenSoap507000.submit(commands507000);
		screenSoap.logout();
		}
		catch(Exception e){
			logger.error(e);
		}
		logger.info("done");
	}
	

}
