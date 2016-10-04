package com.prime.soap;

import java.io.IOException;
import java.net.URI;
import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.http.CommonsHttpConnection;

public class CommonsHttpMessageSender extends org.springframework.ws.transport.http.CommonsHttpMessageSender {

	public WebServiceConnection createConnection(URI uri) throws IOException {
		CommonsHttpConnection connection = (CommonsHttpConnection) super.createConnection(uri);
		PostMethod pm = connection.getPostMethod();

		Cookie[] cookies = getHttpClient().getState().getCookies();
		int numberOfCookies = cookies.length;
		for (int i = 0; i < numberOfCookies; i++) {
			pm.addRequestHeader("Cookie", cookies[i].toString());
		}
		return connection;
	}

	public boolean supports(URI arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
