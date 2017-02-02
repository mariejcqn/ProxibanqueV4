package com.proxibanque.domaine;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Classe du gï¿½rant
 * 
 * @author Marie, Aurïelien, Kevin, Xavier
 *
 */
 @Entity
 @DiscriminatorValue("GERANT")
public class Gerant extends Employe {
	 @OneToMany(mappedBy = "gerant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	/** Collection de conseillers du gerant */
	Collection<Conseiller> conseillers = new ArrayList<Conseiller>();

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