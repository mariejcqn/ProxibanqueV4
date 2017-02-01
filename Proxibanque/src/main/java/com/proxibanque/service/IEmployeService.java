package com.proxibanque.service;

import com.proxibanque.domaine.Employe;

/**
 * Interface des services d'un employ�
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public interface IEmployeService {

	/**
	 * Authentifie un employ�
	 * 
	 * @return Retourne vrai si l'employ� est authentifi�
	 * 
	 * @param Employe
	 *            Employ� � authentifier
	 */
	boolean authentifier(Employe Employe);

}