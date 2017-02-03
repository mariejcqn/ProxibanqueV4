package com.proxibanque.service;

import java.util.Collection;

import com.proxibanque.domaine.Conseiller;
import com.proxibanque.domaine.Client;

/**
 * Interface des services du conseiller
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public interface IConseillerService {

	/**
	 * Affiche la liste des clients du conseiller
	 * 
	 * @return Collection de clients du conseiller
	 * 
	 * @param conseiller
	 *            Conseiller qui souhaite affiche la liste de ses clients
	 */
	Collection<Client> afficherListeClients(Conseiller conseiller);

	/**
	 * Charge le conseiller depuis la base de données par son identifiant
	 * 
	 * @param identifiant
	 *            Identifiant du conseiller
	 * @return Conseiller à retourner
	 */
	Conseiller chargerConseillerParIdentifiant(String identifiant);

}