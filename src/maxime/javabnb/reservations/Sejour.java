package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;
import maxime.javabnb.outils.Utile;

import java.util.Date;

public class Sejour {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
    }

    public void afficher() {
        logement.afficher();
        System.out.println("La date d'arrivée est le " + Utile.formatDate(dateArrivee) + " pour " + nbNuits + " nuits.");
        System.out.println("Le prix de ce séjour est de " + (logement.getTarifParNuit() * nbNuits) + "€.");
    }
}
