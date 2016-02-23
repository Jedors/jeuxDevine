package fr.manastria.jeuxDevine;


/**
 * Instance du jeu, contient le nombre secret
 * 
 * @author Maël Belval
 * @version 1.1
 */
public class Devine {
    private String nom;
    private int nombreLimiteSub;
    private int nbSecret;
    private int nbCoup;
    
    
    /**
     * Constructeur
     * 
     * @param nom
     *      Nom du joueur
     * @param nombreSup
     *      Nombre à deviner maximum
     * @since 1.0
     */
    public Devine(String nom, int nombreSup)
    {
        this.nom = nom;
        if (nombreSup > 0)
        {
            this.nombreLimiteSub = nombreSup;
        }
        else
        {
            System.out.println("Nombre maximum possible invalide");
            System.out.println("Valeur par defaut : 20");
            this.nombreLimiteSub = 20;
        }
        this.nbCoup = 0;
    }

    static public int log2(int n)
    {
        double result = Math.ceil(Math.log(n) / Math.log(2));
        // on force un retour en int
        return (int) result;
    }

    /**
     * Détermine le nombre secret en utilisant une fonction Random
     */
    public void determineNombreSecret()
    {
        this.nbSecret = (int) (Math.random() * this.nombreLimiteSub);
    }

    /**
     * Prend le nombre joué par l'utilisateur et indique si le nombre est trop grand,
     * trop petit ou conforme au nombre secret
     *
     * @param nombre Le nombre donné par l'utilisateur
     * @return Répond si le nombre est trop petit, trop grand ou correct
     */
    public int nombreJoue(int nombre)
    {
        this.nbCoup++;
        if (nombre > nbSecret)
        {
            return 1;
        }
        else if (nombre < nbSecret)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Détermine le profile de l'utilisateur. L'étudiant peut modifier le type de retour de la méthode.
     *
     * @return le profile de l'utilisateur
     */
    public Profile getProfile()
    {
        if (this.nbCoup < log2(this.nombreLimiteSub))
        {
            return Profile.CHANCEUX;
        }
        else if (this.nbCoup == log2(this.nombreLimiteSub))
        {
            return Profile.RATIONNEL;
        }
        else
        {
            return Profile.PASMALIN;
        }
    }


}
