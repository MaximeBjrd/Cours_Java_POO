package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;

import java.util.Date;

public class Sejour {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(Date dateArriveeSejour, int nbNuitsSejour, Logement logementSejour, int nbVoyageursSejour) {
        dateArrivee = dateArriveeSejour;
        nbNuits = nbNuitsSejour;
        logement = logementSejour;
        nbVoyageurs = nbVoyageursSejour;
    }

    public void afficher() {
        logement.afficher();
        System.out.println("La date d'arrivée est le " + dateArrivee + " pour " + nbNuits + " nuits.");
        int prixSejour = logement.getTarifParNuit() * nbNuits;
        System.out.println("Le prix de ce séjour est de " + prixSejour + "€.");
    }
}
