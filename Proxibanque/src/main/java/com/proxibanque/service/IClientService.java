package com.proxibanque.service;

import com.proxibanque.domaine.Client;

/**
 * Interface des services du client
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public interface IClientService {

	/**
	 * Affiche un client
	 * 
	 * @return Client � afficher
	 * 
	 * @param client
	 *            Client � afficher
	 */
	Client afficherClient(Client client);

	/**
	 * Modifie un client en base de donn�es
	 * 
	 * @param client
	 *            Client � modifier
	 */
	void modifierClient(Client client);

}