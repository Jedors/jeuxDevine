package fr.manastria.jeuxDevine;

import fr.manastria.utils.Console;

/**
 * Created by Jean-Philippe on 31/10/2015.
 * 
 * Edited by Jerome on 23/02/2016
 * @version 1.1
 */
public class IHM
{
    public void jeux()
    {
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


        int result = -2, value;

        do
        {
            value = Console.readInteger("Tentez un nombre : ");
            
            if (value >= 0)
            {
                result = devine.nombreJoue(value);
                
                if (result > 0)
                {
                    System.out.println("Trop grand");
                }
                else if (result < 0)
                {
                    System.out.println("Trop petit");
                }
                else
                {
                    System.out.println("Vous avez gagnez !");
                }
            }
            else
            {
                result = -2;
            }
            
            
            
        } while ((result != 0) && (result != -2));
        // séquence d'interactions avec l'utilisateur
        // jusqu'à ce que l'utilisateur trouve le nombre secret
        // ou abandonne.

                
        if (value != -2)
        {
            System.out.println(devine.getProfile().toString());
        }
        else
        {
            System.out.println("Partie abandonnee");
        }
        // Affichage du profile
    }
}
