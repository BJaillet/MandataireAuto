//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.26 at 02:11:09 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modele" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couleur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbPortes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbPlaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="options" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motorisation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emissionCO2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="immatriculation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "marque",
    "modele",
    "couleur",
    "nbPortes",
    "nbPlaces",
    "options",
    "motorisation",
    "emissionCO2",
    "imageURL",
    "prix",
    "immatriculation"
})
@XmlRootElement(name = "vehicule")
public class Vehicule {

    protected Integer id;
    @XmlElement(required = true)
    protected String marque;
    @XmlElement(required = true)
    protected String modele;
    @XmlElement(required = true)
    protected String couleur;
    protected int nbPortes;
    protected int nbPlaces;
    @XmlElement(required = true)
    protected String options;
    @XmlElement(required = true)
    protected String motorisation;
    protected int emissionCO2;
    @XmlElement(required = true)
    protected String imageURL;
    protected int prix;
    @XmlElement(required = true)
    protected String immatriculation;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the marque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Sets the value of the marque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarque(String value) {
        this.marque = value;
    }

    /**
     * Gets the value of the modele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModele() {
        return modele;
    }

    /**
     * Sets the value of the modele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModele(String value) {
        this.modele = value;
    }

    /**
     * Gets the value of the couleur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Sets the value of the couleur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouleur(String value) {
        this.couleur = value;
    }

    /**
     * Gets the value of the nbPortes property.
     * 
     */
    public int getNbPortes() {
        return nbPortes;
    }

    /**
     * Sets the value of the nbPortes property.
     * 
     */
    public void setNbPortes(int value) {
        this.nbPortes = value;
    }

    /**
     * Gets the value of the nbPlaces property.
     * 
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * Sets the value of the nbPlaces property.
     * 
     */
    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * Gets the value of the motorisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorisation() {
        return motorisation;
    }

    /**
     * Sets the value of the motorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorisation(String value) {
        this.motorisation = value;
    }

    /**
     * Gets the value of the emissionCO2 property.
     * 
     */
    public int getEmissionCO2() {
        return emissionCO2;
    }

    /**
     * Sets the value of the emissionCO2 property.
     * 
     */
    public void setEmissionCO2(int value) {
        this.emissionCO2 = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(int value) {
        this.prix = value;
    }

    /**
     * Gets the value of the immatriculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * Sets the value of the immatriculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmatriculation(String value) {
        this.immatriculation = value;
    }

}
