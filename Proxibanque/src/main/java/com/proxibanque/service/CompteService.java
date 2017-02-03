package com.proxibanque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proxibanque.dao.ICompteDao;
import com.proxibanque.domaine.Compte;

import com.proxibanque.domaine.Virement;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * Implémente l'interface ICompteService
 * 
 * @author Marie, Aurélien, Kévin, Xavier
 *
 */
@Service
public class CompteService implements ICompteService {

	@Autowired
	ICompteDao compteDao;

	public CompteService() {
		super();
	}

	/** Voir la documentation de l'interface */
	@Override
	public Compte ajouterCompte(Compte compte) {
		return null;
	}

	/**
	 * Réalise un virement de compte à compte à l'intérieur de la banque à l'aide d'un web service
	 * 
	 * @param compteCrediteur
	 *            Compte créditeur du virement (fournit le montant)
	 * @param compteDebiteur
	 *            Compte débiteur du virement (reçoit le montant)
	 * @param montant
	 *            Montant à transférer
	 * @return 
	 */
	@Override
	public List<Compte> virementCaC(Compte compteCrediteur, Compte compteDebiteur, double montant) {

		// Url du web service
		String url = "http://localhost:8080/RESTfulExample/rest/json/virementcompte/senda";

		// Objet à récupérer
		Virement virement = new Virement();

		// Définition du virement
		double debite = compteDebiteur.getSolde();
		double credite = compteCrediteur.getSolde();
		virement = new Virement(debite, credite, montant);

		try {
			ClientConfig clientConfig = new DefaultClientConfig();

			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

			com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create(clientConfig);

			WebResource webResource = client.resource(url);

			ClientResponse response = webResource.accept("application/json").type("application/json")
					.post(ClientResponse.class, virement);

			virement = (Virement) response.getEntity(Virement.class);

			compteCrediteur.setSolde(virement.getCompteCredite());
			compteDebiteur.setSolde(virement.getCompteDebite());

			List<Compte> listeCompte = new ArrayList<Compte>();
			listeCompte.add(compteCrediteur);
			listeCompte.add(compteDebiteur);

			return listeCompte;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Mettre à jour un compte
	 * 
	 * @param compte
	 *            Compte à modifier
	 * @return
	 */
	@Override
	public void updateCompte(Compte compte) {
		compteDao.save(compte);

	}

}