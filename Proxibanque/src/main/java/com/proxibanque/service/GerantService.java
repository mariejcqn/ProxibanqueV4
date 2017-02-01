package com.proxibanque.service;

import java.util.Collection;
import java.util.Collections;

import com.proxibanque.domaine.Gerant;
import com.proxibanque.domaine.Conseiller;

/**
 * Impl�mente l'interface IGerantService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
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