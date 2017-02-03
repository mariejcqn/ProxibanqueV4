package com.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanque.domaine.Conseiller;

@Repository
public interface IEmployeDao extends JpaRepository<Conseiller, Integer>{

	List<Conseiller> findByIdentifiant(String identifiant);
	
}
