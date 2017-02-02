package com.proxibanque.domaine;

import java.util.*;


/**
 * Classe du client
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */

public class Client {
	/** Identifiant en base de donnees du client */
	private Long id;

	/** Conseiller du client */
	Conseiller conseiller;

	/** Collection de comptes du client */
	Collection<Compte> comptes;
	
	/** Nom du client */
	private String nom;
	/** Prenom du client */
	private String prenom;
	/** Email du client */
	private String email;
	/** Adresse du client */
	private String adresse;

	public Client() {
		super();
	}

	public Client(Conseiller conseiller, Collection<Compte> comptes, String nom, String prenom, String email,
			String adresse) {
		super();
		this.conseiller = conseiller;
		this.comptes = comptes;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	public Client(Conseiller conseiller, String nom, String prenom, String email,
			String adresse) {
		super();
		this.conseiller = conseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}
	
	public Client(Long id, Conseiller conseiller, Collection<Compte> comptes, String nom, String prenom, String email,
			String adresse) {
		super();
		this.conseiller = conseiller;
		this.comptes = comptes;
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}