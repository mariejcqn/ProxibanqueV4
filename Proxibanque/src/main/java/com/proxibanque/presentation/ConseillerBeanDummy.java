package com.proxibanque.presentation;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.service.IClientService;

import util.CreationDao;

@Named
@Scope("session")
public class ConseillerBeanDummy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Conseiller conseiller = new Conseiller();
	private Client client = new Client();

	@Autowired
	private IClientService clientService;

	// M�thode static qui se lance � chaque initialisation
	static {
		new CreationDao().createDataBase();

	}

	// Getters and setters
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

	public String creerClient() {
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

}
