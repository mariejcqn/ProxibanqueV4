package com.proxibanque.service;

import java.util.Collection;
import java.util.Collections;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;

/**
 * Implémente l'interface IConseillerService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
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