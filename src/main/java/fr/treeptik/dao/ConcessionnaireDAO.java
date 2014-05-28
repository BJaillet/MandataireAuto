package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.model.Concessionnaire;

public interface ConcessionnaireDAO extends JpaRepository<Concessionnaire, Integer> {
	
}
