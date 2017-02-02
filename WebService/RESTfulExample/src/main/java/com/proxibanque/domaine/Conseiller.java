package com.proxibanque.domaine;

import java.util.*;
/**
 * Classe du conseiller
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */

public class Conseiller extends Employe {

	/** Gerant du conseiller */
	Gerant gerant;
	
	/** Collection de clients du conseiller */
	Collection<Client> clients = new ArrayList<Client>();
	
	/** Nombre maximum de clients par conseiller */
	private final int NOMBRE_CLIENTS = 10;

	public Conseiller() {
		super();
	}

	public Conseiller(Gerant gerant, Collection<Client> clients) {
		super();
		this.gerant = gerant;
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom, String identifiant, String motDePasse) {
		super(nom, prenom, identifiant, motDePasse);
	}
	
	public Conseiller(String nom, String prenom, String identifiant, String motDePasse, Gerant gerant, Collection<Client> clients) {
		super(nom, prenom, identifiant, motDePasse);
		this.gerant = gerant;
		this.clients = clients;
	}
	
	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public int getNOMBRE_CLIENTS() {
		return NOMBRE_CLIENTS;
	}

}