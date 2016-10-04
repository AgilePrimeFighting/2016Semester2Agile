package com.prime.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prime.jax.LoginResult;
import com.prime.jax.Screen;
import com.prime.jax.ScreenSoap;

@Service
public class SoapClientJax {
	private static final Logger logger = LogManager.getLogger(SoapClientJax.class);

	public void login(){
		Screen screen = new Screen();
		ScreenSoap screenSoap = screen.getScreenSoap();
		LoginResult loginResult = screenSoap.login("MYOB@prime", "n0kbFAgA");
		logger.info("111111");
		logger.info(loginResult.getSession());
	}

}
