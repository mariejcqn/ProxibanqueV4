package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.domaine.Compte;

public interface ICompteDao extends JpaRepository<Compte, Integer>{
	
}
