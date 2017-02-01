package com.proxibanque.service;

import com.proxibanque.domaine.Compte;

/**
 * Interface des services du compte
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public interface ICompteService {

	/**
	 * Ajoute un compte
	 * 
	 * @return Compte ajouté
	 * 
	 * @param compte
	 *            Compte à ajouter
	 */
	Compte ajouterCompte(Compte compte);

	/**
	 * Réalise un virement de compte à compte à l'intérieur de la banque
	 * 
	 * @param compteCrediteur
	 *            Compte créditeur du virement (fournit le montant)
	 * @param compteDebiteur
	 *            Compte débiteur du virement (reçoit le montant)
	 * @param montant
	 *            Montant à transférer
	 */
	void virementCaC(Compte compteCrediteur, Compte compteDebiteur, double montant);

}