package com.proxibanque.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.service.IClientService;
import com.proxibanque.service.ICompteService;
import com.proxibanque.service.IGerantService;
import com.proxibanque.service.IConseillerService;

import util.CreationDao;

@Named
@Scope("session")
public class EmployeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Conseiller conseiller = new Conseiller();
	private Client client = new Client();

	private Compte compteCredite = new Compte();
	private Compte compteDebite = new Compte();
	private double montant;

	@Autowired
	private IClientService clientService;

	@Autowired
	private IGerantService gerantService;

	@Autowired
	private ICompteService compteService;

	@Autowired
	private IConseillerService conseillerService;

	private ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
	private String identifiant = context.getRemoteUser();

	// Méthode static qui se lance à chaque initialisation
	static {
		new CreationDao().createDataBase();
	}

	// Méthode qui s'execute à chaque création du bean
	@PostConstruct
	public void initialiser() {
		setConseiller(conseillerService.chargerConseillerParIdentifiant(identifiant));
	}

	// Constructeur
	public EmployeBean() {
		super();
	}

	// Getters and setters
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public void setGerantService(IGerantService gerantService) {
		this.gerantService = gerantService;
	}

	public void setConseillerService(IConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setCompteService(ICompteService compteService) {
		this.compteService = compteService;
	}

	// Méthode du service
	public String creerClient() {
		client.setConseiller(conseiller);
		clientService.creerClient(client);
		conseiller.getClients().add(client);
		client = new Client();
		return "listeClients";
	}

	public String modifierClient() {
		clientService.creerClient(client);
		client = new Client();
		return "listeClients";
	}

	public String modifierClientGerant() {
		clientService.creerClient(client);
		client = new Client();
		return "listeClientsAll";
	}

	public List<Client> getAfficherClientsAll() {
		return gerantService.afficherClientsAll();
	}

	public void logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler()
				.handleNavigation(FacesContext.getCurrentInstance(), null, "/index.xhtml");
	}

	public String virement() {
		List<Compte> listeCompte = compteService.virementCaC(compteCredite, compteDebite, montant);
		if (listeCompte == null) {

		} else {
			compteCredite = listeCompte.get(0);
			compteDebite = listeCompte.get(1);
			compteService.updateCompte(compteCredite);
			compteService.updateCompte(compteDebite);
		}
		return "listeClients";
	}

	public List<Client> getClientsDecouvert() {
		List<Client> cd = new ArrayList<Client>();
		for (Client client : conseiller.getClients()) {
			for (Compte compte : client.getComptes()) {
				if (compte.getSolde() <= 0) {
					cd.add(client);
					break;
				}
			}
		}
		return cd;
	}
}
