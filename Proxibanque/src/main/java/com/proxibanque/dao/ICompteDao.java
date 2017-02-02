package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanque.domaine.Compte;

@Repository
public interface ICompteDao extends JpaRepository<Compte, Integer>{
	
}
