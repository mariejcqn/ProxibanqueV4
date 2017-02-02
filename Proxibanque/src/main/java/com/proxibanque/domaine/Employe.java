package com.proxibanque.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe d'un employe
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */
@Entity
@DiscriminatorValue("TYPE_EMPLOYE")
public abstract class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/** Identifiant dans la base de donnees */
	private Long id = 0L;
	
	/** Nom de l'employe */
	private String nom;
	/** Prenom de l'employe */
	private String prenom;
	/** Identifiant de connexion de l'employe */
	private String identifiant;
	/** Mot de passe de connexion de l'employe */
	private String motDePasse;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String identifiant, String motDePasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
	}

	public Employe(Long id, String nom, String prenom, String identifiant, String motDePasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
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

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}