package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.domaine.Client;

public interface IClientDao extends JpaRepository<Client, Integer> {
	
}
