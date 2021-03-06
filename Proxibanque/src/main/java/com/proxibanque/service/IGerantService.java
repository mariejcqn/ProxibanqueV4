package com.proxibanque.service;

import java.util.Collection;
import java.util.List;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.domaine.Gerant;

/**
 * Interface des services du g�rant
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public interface IGerantService {

	/**
	 * Affiche la liste des conseillers
	 * 
	 * @param gerant
	 *            G�rant qui souhaite afficher la liste de ses conseillers
	 */
	Collection<Conseiller> afficherListeConseillers(Gerant gerant);
	
	/**
	 * Affiche la liste de tous les clients
	 * 
	 * 
	 */
	List<Client> afficherClientsAll();
	

}