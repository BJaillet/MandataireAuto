package fr.treeptik.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;

import fr.treeptik.jaxb.ConcessionnaireJAXB;
import fr.treeptik.jaxb.VehiculeJAXB;

@Entity
public class Concessionnaire implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
    @XmlElement(required = true)
    protected String raisonSociale;
    @XmlElement(required = true)
    protected String adresse;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String siren;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    @OneToMany
    protected List<Vehicule> vehicules;

    public Concessionnaire() {
    	super();
    }
    
    public Concessionnaire(ConcessionnaireJAXB concessionnaireJAXB) {
    	this.id = concessionnaireJAXB.getId();
    	this.raisonSociale = concessionnaireJAXB.getRaisonSociale();
    	this.adresse = concessionnaireJAXB.getAdresse();
    	this.mail = concessionnaireJAXB.getMail();
    	this.siren = concessionnaireJAXB.getSiren();
    	this.type = concessionnaireJAXB.getType();
    	vehicules = new ArrayList<Vehicule>();
    	for (VehiculeJAXB vehiculeJAXB : concessionnaireJAXB.getVehicule()) {
			this.vehicules.add(new Vehicule(vehiculeJAXB));
		}
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String value) {
        this.raisonSociale = value;
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

    public String getSiren() {
        return siren;
    }

    public void setSiren(String value) {
        this.siren = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public List<Vehicule> getVehicules() {
        if (vehicules == null) {
            vehicules = new ArrayList<Vehicule>();
        }
        return this.vehicules;
    }

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	@Override
	public String toString() {
		return "Concessionnaire [id=" + id + ", raisonSociale=" + raisonSociale
				+ ", adresse=" + adresse + ", mail=" + mail + ", siren="
				+ siren + ", type=" + type + ", vehicules=" + vehicules + "]";
	}
    
}
