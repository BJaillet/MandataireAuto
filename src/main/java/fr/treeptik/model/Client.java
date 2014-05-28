package fr.treeptik.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.treeptik.jaxb.ClientJAXB;

@Entity
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String mail;

    public Client() {
    	super();
    }
    
	public Client(ClientJAXB clientJAXB) {
    	this.id = clientJAXB.getId();
    	this.nom = clientJAXB.getNom();
    	this.prenom = clientJAXB.getPrenom();
    	this.adresse = clientJAXB.getAdresse();
    	this.mail = clientJAXB.getMail();
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String value) {
        this.prenom = value;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String value) {
        this.adresse = value;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String value) {
        this.mail = value;
    }

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + ", mail=" + mail + "]";
	}
    
}
