package fr.manastria.jeuxDevine;

import fr.manastria.utils.Console;

/**
 * Created by Jean-Philippe on 31/10/2015.
 */
public class IHM {
	public void jeux() {
		int nombreMaxSaisie;
		String nomJoueur;

		// Saisie du nom du joueur et la valeur du
		// nombre maximal qu'il veut trouver
		nomJoueur = Console.readLine("Entrez votre nom : ");
		nombreMaxSaisie = Console.readInteger("Entrez un nombre > 0 : ");

		// création d'un représentant du jeu (un objet)
		// en fournissant la limite supérieure de
		// l'intervalle dans lequel le nombre secret
		// sera extrait : [0..n[
		// ainsi que le nom du joueur
		Devine devine = new Devine(nomJoueur, nombreMaxSaisie);
		// on demande au jeu de tirer un nombre aléatoire
		devine.determineNombreSecret();

		// séquence d'interactions avec l'utilisateur
		// jusqu'à ce que l'utilisateur trouve le nombre secret
		// ou abandonne.

		// Affichage du profile
	}
}
