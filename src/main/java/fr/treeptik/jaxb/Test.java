package fr.treeptik.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import fr.treeptik.model.Client;
import fr.treeptik.model.Concessionnaire;

public class Test {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext
				.newInstance("fr.treeptik.jaxb");

		Unmarshaller unmarshaller = context.createUnmarshaller();

		ConcessionnaireJAXB concessionnaireJAXB = (ConcessionnaireJAXB) unmarshaller.unmarshal(new File("concessionnaire.xml"));

//		for (Client client : clients) {
//			System.out.println(personne.getNom() + " " + personne.getPrenom());
//		}
		
		Concessionnaire concessionnaire = new Concessionnaire(concessionnaireJAXB);
		
		System.out.println(concessionnaire);

	}

}