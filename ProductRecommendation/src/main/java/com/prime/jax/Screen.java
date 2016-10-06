
package com.prime.jax;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Screen", targetNamespace = "http://www.acumatica.com/generic/", wsdlLocation = "https://try.myobadvanced.com/Soap/PROVENG.asmx?WSDL")
public class Screen
    extends Service
{

    private final static URL SCREEN_WSDL_LOCATION;
    private final static WebServiceException SCREEN_EXCEPTION;
    private final static QName SCREEN_QNAME = new QName("http://www.acumatica.com/generic/", "Screen");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://try.myobadvanced.com/Soap/PROVENG.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCREEN_WSDL_LOCATION = url;
        SCREEN_EXCEPTION = e;
    }

    public Screen() {
        super(__getWsdlLocation(), SCREEN_QNAME);
    }

    public Screen(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCREEN_QNAME, features);
    }

    public Screen(URL wsdlLocation) {
        super(wsdlLocation, SCREEN_QNAME);
    }

    public Screen(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCREEN_QNAME, features);
    }

    public Screen(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Screen(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ScreenSoap
     */
    @WebEndpoint(name = "ScreenSoap")
    public ScreenSoap getScreenSoap() {
        return super.getPort(new QName("http://www.acumatica.com/generic/", "ScreenSoap"), ScreenSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScreenSoap
     */
    @WebEndpoint(name = "ScreenSoap")
    public ScreenSoap getScreenSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.acumatica.com/generic/", "ScreenSoap"), ScreenSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCREEN_EXCEPTION!= null) {
            throw SCREEN_EXCEPTION;
        }
        return SCREEN_WSDL_LOCATION;
    }

}
