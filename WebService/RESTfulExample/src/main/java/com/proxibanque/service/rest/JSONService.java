package com.proxibanque.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.CompteCourant;

@Path("/json/virementcompte")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> getTrackInJSON() {
		double montant = 500;
		Compte compteDebite = new CompteCourant(); 
		compteDebite.setSolde(5000);
		
		Compte compteCredite = new CompteCourant();
		compteCredite.setSolde(1000);
		
		compteDebite.setSolde(compteDebite.getSolde() - montant);
		compteCredite.setSolde(compteCredite.getSolde() + montant);
		
		List<Compte> listeCompte = new ArrayList<Compte>();
		listeCompte.add(compteDebite);
		listeCompte.add(compteCredite);

		return listeCompte;
		
	}
	
}