package maxime.javabnb.logements;

import maxime.javabnb.utilisateurs.Hote;

public class Logement {

    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public String getAdresse() {
        return adresse;
    }

    public void afficher() {
        hote.afficher();
        System.out.println("Le logement est situé au " + adresse + ".");
        System.out.println("Superficie: " + superficie + "m²");
        System.out.println("Nombre max de voyageurs: " + nbVoyageursMax + "p.");
    }

}
