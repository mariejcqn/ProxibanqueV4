package com.proxibanque.service;

import com.proxibanque.domaine.Compte;

/**
 * Impl�mente l'interface ICompteService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public class CompteService implements ICompteService {

	public CompteService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Compte ajouterCompte(Compte compte) {
		return null;
	}

	/** Voir la documentation de l'interface */
	@Override
	public void virementCaC(Compte compteCrediteur, Compte compteDebiteur, double montant) {
	}

}