package com.proxibanque.domaine;

import java.io.Serializable;

/**
 * Classe des virements
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */

public class Virement implements Serializable {
	// Proprietes
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	/** Montant du virement */
	private double montant;
	/** Montant du compte debite */
	private double compteDebite;
	/** Montant du compte credite */
	private double compteCredite;

	// Constructeurs
	public Virement(double compteDebite, double compteCredite, double montant) {

		super();
		this.montant = montant;
		this.compteDebite = compteDebite;
		this.compteCredite = compteCredite;
	}

	public Virement() {
		super();
	}

	// Getters & Setters
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getCompteDebite() {
		return compteDebite;
	}

	public void setCompteDebite(double compteDebite) {
		this.compteDebite = compteDebite;
	}

	public double getCompteCredite() {
		return compteCredite;
	}

	public void setCompteCredite(double compteCredite) {
		this.compteCredite = compteCredite;
	}

}
