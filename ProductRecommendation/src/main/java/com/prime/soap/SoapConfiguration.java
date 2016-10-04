package com.prime.soap;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@ComponentScan("com.prime.soap")
public class SoapConfiguration extends AsyncConfigurerSupport{

	/*@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.prime.wsdl");
		return marshaller;
	}*/
	 @Override
	    public Executor getAsyncExecutor() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(2);
	        executor.setMaxPoolSize(2);
	        executor.setQueueCapacity(500);
	        executor.setThreadNamePrefix("Provisioning-");
	        executor.initialize();
	        return executor;
	    }

}
