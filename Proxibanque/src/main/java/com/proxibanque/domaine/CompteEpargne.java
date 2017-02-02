package com.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe du compte �pargne
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
@Entity
@DiscriminatorValue("EPARGNE")
public class CompteEpargne extends Compte {

	/** Taux de r�mun�ration du compte �pargne */
	private final double taux = 0.03;

	public CompteEpargne() {
		super();
	}
	
	public CompteEpargne(Client client, String numero, double solde, String dateOuverture) {
		super();
	}

	public double getTaux() {
		return taux;
	}

}