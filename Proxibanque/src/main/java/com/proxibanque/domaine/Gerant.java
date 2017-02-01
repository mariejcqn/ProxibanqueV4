package com.proxibanque.domaine;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Classe du g�rant
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
 *
 */
 @Entity
 @DiscriminatorValue("GERANT")
public class Gerant extends Employe {
	 @OneToMany(mappedBy = "gerant")
	/** Collection de conseillers du g�rant */
	Collection<Conseiller> conseillers;

	public Gerant() {
		super();
	}

	public Gerant(Collection<Conseiller> conseillers) {
		super();
		this.conseillers = conseillers;
	}

	public Gerant(String nom, String prenom, String identifiant, String motDePasse) {
		super(nom, prenom, identifiant, motDePasse);
	}

	public Gerant(String nom, String prenom, String identifiant, String motDePasse, Collection<Conseiller> conseillers) {
		super(nom, prenom, identifiant, motDePasse);
		this.conseillers = conseillers;
	}

	public Gerant(Long id, String nom, String prenom, String identifiant, String motDePasse, Collection<Conseiller> conseillers) {
		super(id, nom, prenom, identifiant, motDePasse);
		this.conseillers = conseillers;
	}

	public Collection<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

}