package com.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe du compte courant
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
@Entity
@DiscriminatorValue("COURANT")
public class CompteCourant extends Compte {

	/** Authorisation de d�couvert du compte courant */
	private final double decouvert = 1000;

	public CompteCourant() {
		super();
	}

	public CompteCourant(Client client, String numero, double solde, String dateOuverture) {
		super();
	}

	public double getDecouvert() {
		return decouvert;
	}

}