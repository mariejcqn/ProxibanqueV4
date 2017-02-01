package com.proxibanque.service;

import java.util.Collection;
import java.util.Collections;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;

/**
 * Impl�mente l'interface IConseillerService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public class ConseillerService extends AEmployeService implements IConseillerService {

	public ConseillerService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Collection<Client> afficherListeClients(Conseiller conseiller) {
		return Collections.emptyList();
	}

}