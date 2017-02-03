package com.proxibanque.service;

import java.util.List;

import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.Employe;

/**
 * Interface des services d'un employé
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public interface IEmployeService {

	/**
	 * Authentifie un employé
	 * 
	 * @return Retourne vrai si l'employé est authentifié
	 * 
	 * @param Employe
	 *            Employé à authentifier
	 */
	boolean authentifier(Employe Employe);

	/**
	 * affiche la liste de tous les comptes
	 * 
	 * @return Retourne la liste de tous les comptes
	 * 
	 * @param Employe
	 *            Employé à authentifier
	 */
	public List<Compte> afficherAllComptes();
}