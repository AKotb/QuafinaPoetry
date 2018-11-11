
package com.org.tempuri;

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
@WebServiceClient(name = "WebServicePoetry", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://ibrahimhakem99-001-site6.gtempurl.com/WebServicePoetry.asmx?WSDL")
public class WebServicePoetry
    extends Service
{

    private final static URL WEBSERVICEPOETRY_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEPOETRY_EXCEPTION;
    private final static QName WEBSERVICEPOETRY_QNAME = new QName("http://tempuri.org/", "WebServicePoetry");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ibrahimhakem99-001-site6.gtempurl.com/WebServicePoetry.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEPOETRY_WSDL_LOCATION = url;
        WEBSERVICEPOETRY_EXCEPTION = e;
    }

    public WebServicePoetry() {
        super(__getWsdlLocation(), WEBSERVICEPOETRY_QNAME);
    }

    public WebServicePoetry(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEPOETRY_QNAME, features);
    }

    public WebServicePoetry(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEPOETRY_QNAME);
    }

    public WebServicePoetry(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEPOETRY_QNAME, features);
    }

    public WebServicePoetry(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServicePoetry(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServicePoetrySoap
     */
    @WebEndpoint(name = "WebServicePoetrySoap")
    public WebServicePoetrySoap getWebServicePoetrySoap() {
        return super.getPort(new QName("http://tempuri.org/", "WebServicePoetrySoap"), WebServicePoetrySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServicePoetrySoap
     */
    @WebEndpoint(name = "WebServicePoetrySoap")
    public WebServicePoetrySoap getWebServicePoetrySoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WebServicePoetrySoap"), WebServicePoetrySoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEPOETRY_EXCEPTION!= null) {
            throw WEBSERVICEPOETRY_EXCEPTION;
        }
        return WEBSERVICEPOETRY_WSDL_LOCATION;
    }

}