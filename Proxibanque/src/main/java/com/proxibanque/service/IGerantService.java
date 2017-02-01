package com.proxibanque.service;

import java.util.Collection;

import com.proxibanque.domaine.Gerant;
import com.proxibanque.domaine.Conseiller;

/**
 * Interface des services du gérant
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
public interface IGerantService {

	/**
	 * Affiche la liste des conseillers
	 * 
	 * @param gerant
	 *            Gérant qui souhaite afficher la liste de ses conseillers
	 */
	Collection<Conseiller> afficherListeConseillers(Gerant gerant);

}