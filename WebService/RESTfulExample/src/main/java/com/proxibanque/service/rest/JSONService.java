package com.proxibanque.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.proxibanque.domaine.Virement;

/**
 * Classe du WebService permettant le virement compte à compte
 * 
 * @author Marie, Aurelien, Kevin, Xavier
 *
 */
@Path("/json/virementcompte")
public class JSONService {
	
//	@POST
//	@Path("/send")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response consumeJSON(double montant ) {
//		Compte compteDebite = new CompteCourant(); 
//		compteDebite.setSolde(5000);
//		
//		Compte compteCredite = new CompteCourant();
//		compteCredite.setSolde(1000);
//		
//		compteDebite.setSolde(compteDebite.getSolde() - montant);
//		compteCredite.setSolde(compteCredite.getSolde() + montant);
//		
//		ArrayList<Compte> listeCompte = new ArrayList<Compte>();
//		listeCompte.add(compteDebite);
//		listeCompte.add(compteCredite);
//
//		return Response.status(200).entity(listeCompte).build();
//	}
	/**
	 * Méthode permettant d'actualiser les soldes lors d'un virement
	 * @param virement
	 * @return Response
	 */
	@POST
	@Path("/senda")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON(Virement virement) {
		double debite = virement.getCompteDebite();
		double credite = virement.getCompteCredite();
		double montant = virement.getMontant();
		
		virement.setCompteDebite(debite-montant);
		virement.setCompteCredite(credite + montant);

		return Response.status(200).entity(virement).build();
	}
}