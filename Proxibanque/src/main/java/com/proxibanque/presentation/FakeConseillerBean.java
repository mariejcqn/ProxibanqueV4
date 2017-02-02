package com.proxibanque.presentation;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.CompteCourant;
import com.proxibanque.domaine.CompteEpargne;
import com.proxibanque.domaine.Conseiller;

@Named
@Scope("session")
public class FakeConseillerBean {

	private Client client = new Client();

	public FakeConseillerBean() {
		super();
		Conseiller con = new Conseiller();
		CompteCourant cc = new CompteCourant();
		cc.setId(33L);
		cc.setNumero("445L2");
		cc.setSolde(300.00);
		CompteEpargne ce = new CompteEpargne();
		ce.setId(44L);
		ce.setNumero("4654A");
		ce.setSolde(300.00);
		Collection<Compte> listecomptes = new ArrayList<Compte>();
		client.setConseiller(con);
		client.setComptes(listecomptes);
		client.getComptes().add(ce);
		client.getComptes().add(cc);
		client.setPrenom("toto");
		client.setNom("tata");
		client.setEmail("toto@gmail.fr");
		client.setAdresse("Lyon");
	}

	public FakeConseillerBean(Client client) {
		super();
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	
//	listecomptes.add(ce);
//	listecomptes.add(cc);
	
	
}
