package com.proxibanque.interception;

import java.io.File;
import java.io.FileWriter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.proxibanque.domaine.Compte;

@Aspect
public class Logging {

	final String chemin = "C:/virement.txt";

	// Constructeur
	public Logging() {
		super();
	}

	// Getters and Setters
	public String getChemin() {
		return chemin;
	}

	// détaille les entrées sorties des méthodes utilisées
	/**
	 * Méthode qui intercepte la méthode virementCaC du compte Service et écrit les données sur un fichier "C:/virement.txt"
	 * @param ProceedingJoinPoint
	 *            
	 * @return Collection de clients du conseiller
	 * 			Retour de la méthode du virementCaC ou null si l'opération n'est pas possible
	 */
	@Around("execution(com.proxibanque.service.CompteService.virementCaC(..)")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		// Récupération des arguments
		System.out.println("Récupération des arguments");
		Object[] args = pjp.getArgs();
		Object retVal = new Object();

		// Récupération du compte debite
		Compte compteCredite = (Compte) args[0];
		Compte compteDebite = (Compte) args[1];
		double montant = (double) args[2];
		double solde = compteDebite.getSolde();

		// Regarder le type de compte et vérifier que l'opération est possible
		// sans dépasser les limites de comptes
		// Sinon return null
		if (compteDebite.getClass().equals("CompteCourant")) {
			if (solde - montant >= -1000) {
				retVal = pjp.proceed();
			} else {
				System.out.println("APRES, RESULTAT = " + retVal);
				return null;
			}

		} else {
			if (solde - montant >= 0) {
				retVal = pjp.proceed();
			} else {
				System.out.println("APRES, RESULTAT = " + retVal);
				return null;
			}
		}

		// Ecriture
		if (retVal != null){
			ecritureFichier(compteDebite.getSolde(), compteCredite.getSolde(), montant);
		}
		
		System.out.println("APRES, RESULTAT = " + retVal);
		return retVal;
	}

	public void ecritureFichier(double numCompteDebite, double numCompteCredite, double montant) {
		File fichier = new File(this.chemin);
		try {
			if (fichier.exists()) {

			} else {
				// Creation du fichier
				fichier.createNewFile();
			}
			// creation d'un writer (un écrivain)
			FileWriter writer = new FileWriter(fichier);
			try {
				writer.write(numCompteDebite + " " + numCompteCredite + " " + montant + "\n");
			} finally {
				// quoiqu'il arrive, on ferme le fichier
				writer.close();
			}
		} catch (Exception e) {
			System.out.println("Impossible de creer le fichier");
		}
	}
}
