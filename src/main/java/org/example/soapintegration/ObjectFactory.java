//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.16 a las 09:54:42 PM COT 
//


package org.example.soapintegration;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.soapintegration package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.soapintegration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetScoreRequest }
     * 
     */
    public GetScoreRequest createGetScoreRequest() {
        return new GetScoreRequest();
    }

    /**
     * Create an instance of {@link GetScoreResponse }
     * 
     */
    public GetScoreResponse createGetScoreResponse() {
        return new GetScoreResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

}
