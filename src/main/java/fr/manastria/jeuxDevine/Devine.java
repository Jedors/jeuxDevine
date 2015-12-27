package fr.manastria.jeuxDevine;

public class Devine {

	public Devine(String nom, int nombreSup) {

	}

	static public int log2(int n) {
		double result = Math.ceil(Math.log(n) / Math.log(2));
		// on force un retour en int
		return (int) result;
	}

	/**
	 * Détermine le nombre secret en utilisant une fonction Random
	 */
	public void determineNombreSecret() {

	}

	/**
	 * Prend le nombre joué par l'utilisateur et indique si le nombre est trop grand,
	 * trop petit ou conforme au nombre secret
	 *
	 * @param nombre Le nombre donné par l'utilisateur
	 * @return Répond si le nombre est trop petit, trop grand ou correct
	 */
	public int nombreJoue(int nombre) {


		return 0;
	}

	/**
	 * Détermine le profile de l'utilisateur. L'étudiant peut modifier le type de retour de la méthode.
	 *
	 * @return le profile de l'utilisateur
	 */
	public Profile getProfile() {


		return Profile.RATIONNEL;
	}


}
