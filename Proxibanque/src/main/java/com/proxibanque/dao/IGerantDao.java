package com.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanque.domaine.Gerant;

@Repository
public interface IGerantDao extends JpaRepository<Gerant, Long>{

}
