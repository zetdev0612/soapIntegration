//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.16 a las 09:54:42 PM COT 
//


package org.example.soapintegration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para score complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="score"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wins" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="losses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ties" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "user",
    "wins",
    "losses",
    "ties"
})
public class Score {

    @XmlElement(required = true)
    protected String user;
    protected int wins;
    protected int losses;
    protected int ties;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad wins.
     * 
     */
    public int getWins() {
        return wins;
    }

    /**
     * Define el valor de la propiedad wins.
     * 
     */
    public void setWins(int value) {
        this.wins = value;
    }

    /**
     * Obtiene el valor de la propiedad losses.
     * 
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Define el valor de la propiedad losses.
     * 
     */
    public void setLosses(int value) {
        this.losses = value;
    }

    /**
     * Obtiene el valor de la propiedad ties.
     * 
     */
    public int getTies() {
        return ties;
    }

    /**
     * Define el valor de la propiedad ties.
     * 
     */
    public void setTies(int value) {
        this.ties = value;
    }

}
