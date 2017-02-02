package com.proxibanque.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe du client
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */
@Entity
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/** Identifiant en base de donnees du client */
	private Long id;

	@ManyToOne
	/** Conseiller du client */
	Conseiller conseiller;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
	/** Collection de comptes du client */
	Collection<Compte> comptes = new ArrayList<Compte>();
	
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
		comptes = new ArrayList<Compte>();
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