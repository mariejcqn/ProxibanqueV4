package com.proxibanque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proxibanque.dao.ICompteDao;
import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.domaine.Employe;

/**
 * Implémente l'interface IEmployeService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public abstract class AEmployeService implements IEmployeService {

	@Autowired
	private ICompteDao compteDao;

	public AEmployeService() {
		super();
	}

	public void setCompteDao(ICompteDao compteDao) {
		this.compteDao = compteDao;
	}

	/** Voir la documentation de l'interface */
	@Override
	public boolean authentifier(Employe Employe) {
		return false;
	}
		
	/** Voir la documentation de l'interface */
	@Override
	public List<Compte> afficherAllComptes() {
		return compteDao.findAll();
	}

}