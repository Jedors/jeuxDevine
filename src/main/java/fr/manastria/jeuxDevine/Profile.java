package fr.manastria.jeuxDevine;

/**
 * Vous n'êtes pas obligé d'utiliser cette classe.
 * Elle sert d'exemple pour les étudiants qui veulent utilser l'enumeration en Java
 */

public enum Profile {
    PASMALIN("Pas malin"),
    CHANCEUX("Chanceux"),
    RATIONNEL("Rationnel");

    private String name = "";

    //Constructeur
    Profile(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
