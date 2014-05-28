package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.model.Vehicule;

public interface VehiculeDAO extends JpaRepository<Vehicule, Integer> {
	
}
