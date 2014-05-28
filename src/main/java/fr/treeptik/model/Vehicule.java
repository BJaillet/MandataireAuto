package fr.treeptik.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.treeptik.jaxb.VehiculeJAXB;

@Entity
public class Vehicule implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
    protected String marque;
    protected String modele;
    protected String couleur;
    protected int nbPortes;
    protected int nbPlaces;
    protected String options;
    protected String motorisation;
    protected int emissionCO2;
    protected String imageURL;
    protected int prix;
    protected String immatriculation;

    public Vehicule() {
    	super();
    }
    
    public Vehicule(VehiculeJAXB vehiculeJAXB) {
    	this.id = vehiculeJAXB.getId();
    	this.marque = vehiculeJAXB.getMarque();
    	this.modele = vehiculeJAXB.getModele();
    	this.couleur = vehiculeJAXB.getCouleur();
    	this.nbPortes = vehiculeJAXB.getNbPortes();
    	this.nbPlaces = vehiculeJAXB.getNbPlaces();
    	this.options = vehiculeJAXB.getOptions();
    	this.motorisation = vehiculeJAXB.getMotorisation();
    	this.emissionCO2 = vehiculeJAXB.getEmissionCO2();
    	this.imageURL = vehiculeJAXB.getImageURL();
    	this.prix = vehiculeJAXB.getPrix();
    	this.immatriculation = vehiculeJAXB.getImmatriculation();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String value) {
        this.marque = value;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String value) {
        this.modele = value;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String value) {
        this.couleur = value;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int value) {
        this.nbPortes = value;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int value) {
        this.nbPlaces = value;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String value) {
        this.options = value;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(String value) {
        this.motorisation = value;
    }

    public int getEmissionCO2() {
        return emissionCO2;
    }

    public void setEmissionCO2(int value) {
        this.emissionCO2 = value;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String value) {
        this.imageURL = value;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int value) {
        this.prix = value;
    }

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", marque=" + marque + ", modele="
				+ modele + ", couleur=" + couleur + ", nbPortes=" + nbPortes
				+ ", nbPlaces=" + nbPlaces + ", options=" + options
				+ ", motorisation=" + motorisation + ", emissionCO2="
				+ emissionCO2 + ", imageURL=" + imageURL + ", prix=" + prix
				+ ", immatriculation=" + immatriculation + "]";
	}
    
}
