package maxime.javabnb.logements;

import maxime.javabnb.utilisateurs.Hote;

public class Maison extends Logement {

    private int superficieJardin;
    private boolean possedePiscine;

    public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin, boolean possedePiscine) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin = superficieJardin;
        this.possedePiscine = possedePiscine;
    }

    @Override
    public void afficher() {
        getHote().afficher();

        System.out.println("L'adresse de cette maison est: " + getAdresse());
        System.out.println("Superficie: " + getSuperficie() + "m²");
        System.out.println("Nombre max de voyageurs: " + getNbVoyageursMax() + "p.");

        if(superficieJardin > 0) {
            System.out.println("Jardin: Oui (" + superficieJardin + "m²)");
        }
        else {
            System.out.println("Jardin: Non");
        }
        System.out.println("Piscine: " + (possedePiscine ? "Oui" : "Non"));
    }

}
