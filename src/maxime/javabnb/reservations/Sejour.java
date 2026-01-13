package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;
import maxime.javabnb.outils.Utile;

import java.util.Date;

public abstract class Sejour implements Reservable {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;
    protected int prix;

    public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
    }

    public abstract void miseAJourPrixSejour();

    // La classe est abstract et implemente une interface donc pas besoin de redéfinir ses méthodes
    public boolean aUneDateArriveeCorrecte() {
        Date dateActuelle = new Date();
        return dateArrivee.after(dateActuelle);
    }

    public boolean aUnNombreVoyageursCorrect() {
        return (nbVoyageurs > 0) && (nbVoyageurs <= logement.getNbVoyageursMax());
    }

    public void afficher() {
        logement.afficher();
        System.out.println("La date d'arrivée est le " + Utile.formatDate(dateArrivee) + " pour " + nbNuits + " nuits.");
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public Logement getLogement() {
        return logement;
    }

}
