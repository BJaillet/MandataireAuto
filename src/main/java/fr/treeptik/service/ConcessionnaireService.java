package fr.treeptik.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ConcessionnaireDAO;
import fr.treeptik.model.Concessionnaire;
import fr.treeptik.model.Vehicule;

@Service
public class ConcessionnaireService {
	
	@Inject
	private ConcessionnaireDAO concessionnaireDAO;
	
	@Autowired
	private VehiculeService vehiculeService;
	
	@Transactional
	public Concessionnaire save(Concessionnaire concessionnaire) throws ServiceException {
		Concessionnaire updatedConcessionnaire = null;
		try {
			updatedConcessionnaire = concessionnaireDAO.save(concessionnaire);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return updatedConcessionnaire;
	}

	public List<Concessionnaire> findAll() throws ServiceException {
		List<Concessionnaire> findAllConcessionnaire = null;
		try {
			findAllConcessionnaire = concessionnaireDAO.findAll();
			return findAllConcessionnaire;
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	public Concessionnaire findById(Integer id) throws ServiceException {
		try {
			return concessionnaireDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Transactional
	public void delete(Concessionnaire concessionnaire) throws ServiceException {
		try {
			concessionnaireDAO.delete(concessionnaire);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
	
	public Concessionnaire saveConcessionnaireAndVehicules(Concessionnaire concessionnaire) throws ServiceException {
		List<Vehicule> vehicules = new ArrayList<>();
		
		for (Vehicule vehicule : concessionnaire.getVehicules()) {
			vehicules.add(vehiculeService.save(vehicule));
		}
		
		Concessionnaire savedConcessionnaire = concessionnaireDAO.save(concessionnaire);
		
		savedConcessionnaire.setVehicules(vehicules);
		return savedConcessionnaire;
	}
}
