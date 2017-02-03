package com.proxibanque.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.dao.IEmployeDao;

/**
 * Impl�mente l'interface IConseillerService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
@Service
public class ConseillerService extends AEmployeService implements IConseillerService {

	@Autowired
	private IEmployeDao conseillerDao;
	
	public ConseillerService() {
		super();
	}

	public void setConseillerDao(IEmployeDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}

	/** Voir la documentation de l'interface */
	@Override
	public Collection<Client> afficherListeClients(Conseiller conseiller) {
		return Collections.emptyList();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Conseiller chargerConseillerParIdentifiant(String identifiant) {
		ArrayList<Conseiller> listeConseillers = (ArrayList<Conseiller>) conseillerDao.findByIdentifiant(identifiant);
		return listeConseillers.get(0);
	}

}