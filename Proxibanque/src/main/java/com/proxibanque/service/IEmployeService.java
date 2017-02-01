package com.proxibanque.service;

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

}