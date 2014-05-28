package fr.treeptik.service;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.service.spi.ServiceException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.VehiculeDAO;
import fr.treeptik.model.Vehicule;

@Service
public class VehiculeService {

	@Inject
	private VehiculeDAO vehiculeDAO;
	
	@Transactional
	public Vehicule save(Vehicule vehicule) throws ServiceException {
		Vehicule updatedVehicule = null;
		try {
			updatedVehicule = vehiculeDAO.save(vehicule);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return updatedVehicule;
	}

	public List<Vehicule> findAll() throws ServiceException {
		List<Vehicule> findAllVehicule = null;
		try {
			findAllVehicule = vehiculeDAO.findAll();
			return findAllVehicule;
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	public Vehicule findById(Integer id) throws ServiceException {
		try {
			return vehiculeDAO.findOne(id);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Transactional
	public void delete(Vehicule vehicule) throws ServiceException {
		try {
			vehiculeDAO.delete(vehicule);
		} catch (DataAccessException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}
