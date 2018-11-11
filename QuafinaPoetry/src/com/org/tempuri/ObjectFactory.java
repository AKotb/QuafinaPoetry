
package com.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfAnalysisClass_QNAME = new QName("http://tempuri.org/", "ArrayOfAnalysisClass");
    private final static QName _ArrayOfString_QNAME = new QName("http://tempuri.org/", "ArrayOfString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRythmsForPracticeResponse }
     * 
     */
    public GetRythmsForPracticeResponse createGetRythmsForPracticeResponse() {
        return new GetRythmsForPracticeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetRythmsForPractice }
     * 
     */
    public GetRythmsForPractice createGetRythmsForPractice() {
        return new GetRythmsForPractice();
    }

    /**
     * Create an instance of {@link GetSea }
     * 
     */
    public GetSea createGetSea() {
        return new GetSea();
    }

    /**
     * Create an instance of {@link GetSeasFromEngine }
     * 
     */
    public GetSeasFromEngine createGetSeasFromEngine() {
        return new GetSeasFromEngine();
    }

    /**
     * Create an instance of {@link ArrayOfAnalysisClass }
     * 
     */
    public ArrayOfAnalysisClass createArrayOfAnalysisClass() {
        return new ArrayOfAnalysisClass();
    }

    /**
     * Create an instance of {@link GetSeaResponse }
     * 
     */
    public GetSeaResponse createGetSeaResponse() {
        return new GetSeaResponse();
    }

    /**
     * Create an instance of {@link GetSeaStringResponse }
     * 
     */
    public GetSeaStringResponse createGetSeaStringResponse() {
        return new GetSeaStringResponse();
    }

    /**
     * Create an instance of {@link GetSeasFromEngineResponse }
     * 
     */
    public GetSeasFromEngineResponse createGetSeasFromEngineResponse() {
        return new GetSeasFromEngineResponse();
    }

    /**
     * Create an instance of {@link GetSeaString }
     * 
     */
    public GetSeaString createGetSeaString() {
        return new GetSeaString();
    }

    /**
     * Create an instance of {@link AnalysisClass }
     * 
     */
    public AnalysisClass createAnalysisClass() {
        return new AnalysisClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnalysisClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfAnalysisClass")
    public JAXBElement<ArrayOfAnalysisClass> createArrayOfAnalysisClass(ArrayOfAnalysisClass value) {
        return new JAXBElement<ArrayOfAnalysisClass>(_ArrayOfAnalysisClass_QNAME, ArrayOfAnalysisClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

}
