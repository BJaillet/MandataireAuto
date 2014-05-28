package fr.treeptik.controller;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import fr.treeptik.jaxb.ConcessionnaireJAXB;
import fr.treeptik.model.Concessionnaire;
import fr.treeptik.model.Vehicule;
import fr.treeptik.service.ConcessionnaireService;

@Controller
@RequestMapping(value = "/concessionnaire")
public class ConcessionnaireController {

	@Autowired
	private ConcessionnaireService concessionnaireService;
	
	@RequestMapping(value = "/display.do", method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute MultipartFile file) throws Exception {
		ModelAndView modelAndView = new ModelAndView("display");
		JAXBContext context = JAXBContext
				.newInstance("fr.treeptik.jaxb");
		
		File localXMLFile = new File("test.xml");
		file.transferTo(localXMLFile);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		ConcessionnaireJAXB concessionnaireJAXB = (ConcessionnaireJAXB) unmarshaller.unmarshal(localXMLFile);
		
		Concessionnaire concessionnaire = new Concessionnaire(concessionnaireJAXB);
		concessionnaire = concessionnaireService.saveConcessionnaireAndVehicules(concessionnaire);
		
		List<Vehicule> vehicules = concessionnaire.getVehicules();
		
		modelAndView.addObject("concessionnaire", concessionnaire);
		modelAndView.addObject("vehicules", vehicules);
		
		for (Vehicule vehicule : concessionnaire.getVehicules()) {
			System.out.println(vehicule);
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/load.do", method = RequestMethod.GET)
	public ModelAndView load() throws Exception {
		ModelAndView modelAndView = new ModelAndView("load");
		return modelAndView;
	}
	
}
