package com.proxibanque.domaine;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 * Classe du compte bancaire
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_COMPTE")
public abstract class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/** Identifiant en base de donn�es du compte */
	private Long id;
	
	@OneToOne
	/** Client du compte */
	Client client;
	
	/** Numero de compte au format chaine de caracteres */
	private String numero;
	/** Solde du compte */
	private double solde;
	/** Date d'ouverture du compte */
	private String dateOuverture;

	public Compte() {
		super();
	}

	public Compte(Long id, Client client, String numero, double solde, String dateOuverture) {
		super();
		this.id = id;
		this.client = client;
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public Compte(Client client, String numero, double solde, String dateOuverture) {
		super();
		this.client = client;
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}