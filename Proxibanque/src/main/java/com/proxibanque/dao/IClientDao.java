package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanque.domaine.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Integer> {
	
}
