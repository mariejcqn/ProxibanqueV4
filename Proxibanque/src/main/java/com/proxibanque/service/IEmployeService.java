package com.proxibanque.service;

import java.util.List;

import com.proxibanque.domaine.Compte;
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

	/**
	 * affiche la liste de tous les comptes
	 * 
	 * @return Retourne la liste de tous les comptes
	 * 
	 * @param Employe
	 *            Employ� � authentifier
	 */
	public List<Compte> afficherAllComptes();
}