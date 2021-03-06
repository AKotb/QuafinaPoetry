
package com.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServicePoetrySoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServicePoetrySoap {


    /**
     * 
     * @param poet
     */
    @WebMethod(operationName = "GetSea", action = "http://tempuri.org/GetSea")
    @RequestWrapper(localName = "GetSea", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSea")
    @ResponseWrapper(localName = "GetSeaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSeaResponse")
    public void getSea(
        @WebParam(name = "Poet", targetNamespace = "http://tempuri.org/")
        String poet);

    /**
     * 
     * @param poet
     * @return
     *     returns org.tempuri.ArrayOfAnalysisClass
     */
    @WebMethod(operationName = "GetSeaString", action = "http://tempuri.org/GetSeaString")
    @WebResult(name = "GetSeaStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetSeaString", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSeaString")
    @ResponseWrapper(localName = "GetSeaStringResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSeaStringResponse")
    public ArrayOfAnalysisClass getSeaString(
        @WebParam(name = "Poet", targetNamespace = "http://tempuri.org/")
        String poet);

    /**
     * 
     * @param poet
     */
    @WebMethod(operationName = "GetSeasFromEngine", action = "http://tempuri.org/GetSeasFromEngine")
    @RequestWrapper(localName = "GetSeasFromEngine", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSeasFromEngine")
    @ResponseWrapper(localName = "GetSeasFromEngineResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSeasFromEngineResponse")
    public void getSeasFromEngine(
        @WebParam(name = "Poet", targetNamespace = "http://tempuri.org/")
        String poet);

    /**
     * 
     * @param rythmRequired
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "GetRythms_ForPractice", action = "http://tempuri.org/GetRythms_ForPractice")
    @WebResult(name = "GetRythms_ForPracticeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRythms_ForPractice", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRythmsForPractice")
    @ResponseWrapper(localName = "GetRythms_ForPracticeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRythmsForPracticeResponse")
    public ArrayOfString getRythmsForPractice(
        @WebParam(name = "RythmRequired", targetNamespace = "http://tempuri.org/")
        String rythmRequired);

}
