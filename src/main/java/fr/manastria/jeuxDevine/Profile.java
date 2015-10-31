package fr.manastria.jeuxDevine;

public enum Profile {
	PASMALIN("Pas malin"),
	CHANCEUX("Chanceux"),
	RATIONNEL("Rationnel");

	private String name = "";

	//Constructeur
	Profile(String name){
		this.name = name;
	}

	public String toString(){
		return name;
	}
}
