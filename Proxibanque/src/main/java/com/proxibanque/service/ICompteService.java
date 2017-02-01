package com.proxibanque.service;

import com.proxibanque.domaine.Compte;

/**
 * Interface des services du compte
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public interface ICompteService {

	/**
	 * Ajoute un compte
	 * 
	 * @return Compte ajout�
	 * 
	 * @param compte
	 *            Compte � ajouter
	 */
	Compte ajouterCompte(Compte compte);

	/**
	 * R�alise un virement de compte � compte � l'int�rieur de la banque
	 * 
	 * @param compteCrediteur
	 *            Compte cr�diteur du virement (fournit le montant)
	 * @param compteDebiteur
	 *            Compte d�biteur du virement (re�oit le montant)
	 * @param montant
	 *            Montant � transf�rer
	 */
	void virementCaC(Compte compteCrediteur, Compte compteDebiteur, double montant);

}