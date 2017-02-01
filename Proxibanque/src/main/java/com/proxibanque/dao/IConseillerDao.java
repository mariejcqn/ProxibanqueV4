package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibanque.domaine.Conseiller;

public interface IConseillerDao extends JpaRepository<Conseiller, Integer>{

}
