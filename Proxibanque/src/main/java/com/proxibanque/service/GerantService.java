package com.proxibanque.service;

import java.util.Collection;
import java.util.Collections;

import com.proxibanque.domaine.Gerant;
import com.proxibanque.domaine.Conseiller;

/**
 * Implémente l'interface IGerantService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public class GerantService extends AEmployeService implements IGerantService {

	
	public GerantService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Collection<Conseiller> afficherListeConseillers(Gerant gerant) {
		return Collections.emptyList();
	}

}