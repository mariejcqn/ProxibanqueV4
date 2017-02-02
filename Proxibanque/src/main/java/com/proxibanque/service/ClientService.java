package com.proxibanque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.dao.IClientDao;
import com.proxibanque.domaine.Client;

/**
 * Implémente l'interface IClientService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
@Service
public class ClientService implements IClientService {
	
	@Autowired
	private IClientDao clientDao;
	
	public ClientService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Client afficherClient(Client client) {
		return null;
	}

	/** Voir la documentation de l'interface */
	@Override
	public void modifierClient(Client client) {
	}
	
	/** Voir la documentation de l'interface */
	@Override
	public void creerClient(Client client) {
		clientDao.save(client);
	}


}