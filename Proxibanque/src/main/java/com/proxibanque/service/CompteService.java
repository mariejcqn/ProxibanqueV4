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
 * Impl�mente l'interface ICompteService
 * 
 * @author Marie, Aur�lien, K�vin, Xavier
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
	 * R�alise un virement de compte � compte � l'int�rieur de la banque � l'aide d'un web service
	 * 
	 * @param compteCrediteur
	 *            Compte cr�diteur du virement (fournit le montant)
	 * @param compteDebiteur
	 *            Compte d�biteur du virement (re�oit le montant)
	 * @param montant
	 *            Montant � transf�rer
	 * @return 
	 */
	@Override
	public List<Compte> virementCaC(Compte compteCrediteur, Compte compteDebiteur, double montant) {

		// Url du web service
		String url = "http://localhost:8080/RESTfulExample/rest/json/virementcompte/senda";

		// Objet � r�cup�rer
		Virement virement = new Virement();

		// D�finition du virement
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
	 * Mettre � jour un compte
	 * 
	 * @param compte
	 *            Compte � modifier
	 * @return
	 */
	@Override
	public void updateCompte(Compte compte) {
		compteDao.save(compte);

	}

}