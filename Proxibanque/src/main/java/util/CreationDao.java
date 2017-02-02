package util;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanque.dao.ICompteDao;
import com.proxibanque.dao.IGerantDao;
import com.proxibanque.domaine.Client;
import com.proxibanque.domaine.Compte;
import com.proxibanque.domaine.CompteCourant;
import com.proxibanque.domaine.CompteEpargne;
import com.proxibanque.domaine.Conseiller;
import com.proxibanque.domaine.Gerant;

@Named
public class CreationDao {
	
	
	private IGerantDao gerantDao;
	private ICompteDao compteDao;
	
	public void setGerantDao(IGerantDao gerantDao) {
		this.gerantDao = gerantDao;
	}

	
	public void setCompteDao(ICompteDao compteDao) {
		this.compteDao = compteDao;
	}


	public static void main(String[] args) {
		new CreationDao().createDataBase();

	}
	
	public void createDataBase(){
		//chargement du contexte
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//récupération d'un bean (dao)
		gerantDao = (IGerantDao) appContext.getBean("IGerantDao");
		compteDao = (ICompteDao) appContext.getBean("ICompteDao");
		
		//utilisation du bean (insertion en base)
		
		//Création du Gérant
		Gerant gerard= new Gerant("Président", "Gerard", "Gerard", "toto");
		
		
		//Création de la liste des conseillers du gérant
		List<Conseiller> listeConseiller = new ArrayList<Conseiller>();
		Conseiller lucie = new Conseiller("Conseillere1","Lucie", "Lucie", "toto");
		lucie.setGerant(gerard);
		Conseiller claire = new Conseiller("Conseiller2", "Claire", "Claire", "toto");
		claire.setGerant(gerard);
		
		listeConseiller.add(claire);
		listeConseiller.add(lucie);
		
		gerard.setConseillers(listeConseiller);
		
		
		//Création de la liste des clients de chaque conseiller
		Client aurelien = new Client(claire,"Paillard","Aurelien","paillard.aurelien@gmail.com","Rue du Narvalot 69 XXX Villeurbane");
		Client camille = new Client(claire,"Cano","Camille","cano.camille@outlook.com","Avenue d'Eude 69 100 Villeurbanne");
		Client kenzy = new Client(claire,"Bouchema","Kenzy","kenzy.bouchema@outlook.fr","Route du Rire 69 001 Lyon");
		Client kevin = new Client(claire,"Tekaya","Kevin","kevin.tekaya@gmail.fr","Avenue du The 69 006 Lyon");
		Client marieJ = new Client(claire,"Jacquin","Marie","marie.jacquin@gmail.com","Rue de la Blonderie 69 100 Villerubanne");
		Client marieM = new Client(claire,"Martelat","Marie","marie.jacquin@gmail.com","Lieu dit del Mondort 69 XXX XXX");
		Client xavier = new Client(claire,"Seta","Xavier","xavier.seta@gmail.com","Rue du Blond 69 003 Lyon");
		
		List<Client> listeClient1 = new ArrayList<Client>();
		listeClient1.add(aurelien);
		listeClient1.add(camille);
		listeClient1.add(kenzy);
		listeClient1.add(kevin);
		List<Client> listeClient2 = new ArrayList<Client>();
		listeClient2.add(marieJ);
		listeClient2.add(marieM);
		listeClient2.add(xavier);
		
		claire.setClients(listeClient1);
		lucie.setClients(listeClient2);
		
		//Création des comptes
		CompteCourant compte1 = new CompteCourant(aurelien, "1661369852", -100.0, "12/08/2010");
		
		CompteCourant compte2 = new CompteCourant(camille, "7845163133", 355,"02/02/2015");
		CompteCourant compte3 = new CompteCourant(kenzy, "8456131320", 154,"25/11/2014");
		CompteCourant compte4 = new CompteCourant(kevin, "7560219252", 850, "30/01/2010");
		CompteCourant compte5 = new CompteCourant(marieJ, "5156130310", 666, "17/09/1999");
		CompteCourant compte6 = new CompteCourant(marieM, "5452211441", 1000000, "01/01/2017");
		CompteCourant compte7 = new CompteCourant(xavier, "4543215485",-1, "06/05/2005");
		CompteEpargne compte8 = new CompteEpargne(kenzy, "8755641651",3520,"07/02/2008");
		CompteEpargne compte9 = new CompteEpargne(marieM, "5646311033",10000000,"19/12/2011");
		CompteEpargne compte10 = new CompteEpargne(kevin,"5464131035",1500,"04/06/2014");
		
		List<Compte> listeCompte1 = new ArrayList<Compte>();
		listeCompte1.add(compte1);
		aurelien.setComptes(listeCompte1);
		List<Compte> listeCompte2 = new ArrayList<Compte>();
		listeCompte2.add(compte2);
		camille.setComptes(listeCompte2);
		List<Compte> listeCompte3 = new ArrayList<Compte>();
		listeCompte3.add(compte3);
		listeCompte3.add(compte8);
		kenzy.setComptes(listeCompte3);
		List<Compte> listeCompte4 = new ArrayList<Compte>();
		listeCompte4.add(compte4);
		listeCompte1.add(compte10);
		kevin.setComptes(listeCompte4);
		List<Compte> listeCompte5 = new ArrayList<Compte>();
		listeCompte5.add(compte5);
		marieJ.setComptes(listeCompte5);
		List<Compte> listeCompte6 = new ArrayList<Compte>();
		listeCompte6.add(compte6);
		listeCompte1.add(compte9);
		marieM.setComptes(listeCompte6);
		List<Compte> listeCompte7 = new ArrayList<Compte>();
		listeCompte7.add(compte7);
		xavier.setComptes(listeCompte7);
		
		//Mises en base des informations
		gerantDao.save(gerard);
		
	}

}
