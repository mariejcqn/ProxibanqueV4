package com.proxibanque.service;

import com.proxibanque.domaine.Client;

/**
 * Interface des services du client
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public interface IClientService {

	/**
	 * Affiche un client
	 * 
	 * @return Client à afficher
	 * 
	 * @param client
	 *            Client à afficher
	 */
	Client afficherClient(Client client);

	/**
	 * Modifie un client en base de données
	 * 
	 * @param client
	 *            Client à modifier
	 */
	void modifierClient(Client client);

}