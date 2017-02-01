package com.proxibanque.service;

import com.proxibanque.domaine.Employe;

/**
 * Impl�mente l'interface IEmployeService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public abstract class AEmployeService implements IEmployeService {

	public AEmployeService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public boolean authentifier(Employe Employe) {
		return false;
	}

}