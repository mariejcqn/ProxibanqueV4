package com.proxibanque.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.dao.IClientDao;
import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.domaine.Gerant;

/**
 * Implémente l'interface IGerantService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */

@Service
public class GerantService extends AEmployeService implements IGerantService {

	@Autowired
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public GerantService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Collection<Conseiller> afficherListeConseillers(Gerant gerant) {
		return Collections.emptyList();
	}
	
	/** Voir la documentation de l'interface */
	@Override
	public List<Client> afficherClientsAll() {
		return clientDao.findAll();
	}

}