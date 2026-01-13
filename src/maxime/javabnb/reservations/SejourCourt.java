package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {

    SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
        prix = nbNuits * logement.getTarifParNuit();
    }

    public boolean aUnNombreNuitsCorrect() {
        return (getNbNuits() >= 1) && (getNbNuits() <= 5);
    }

    @Override
    public void miseAJourPrixSejour() {
        prix = getNbNuits() * getLogement().getTarifParNuit();
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le prix de ce séjour court est: " + prix + "€");
    }

}
