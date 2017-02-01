package com.proxibanque.service;

import java.util.Collection;

import com.proxibanque.domaine.Gerant;
import com.proxibanque.domaine.Conseiller;

/**
 * Interface des services du g�rant
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
public interface IGerantService {

	/**
	 * Affiche la liste des conseillers
	 * 
	 * @param gerant
	 *            G�rant qui souhaite afficher la liste de ses conseillers
	 */
	Collection<Conseiller> afficherListeConseillers(Gerant gerant);

}