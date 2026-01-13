package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour {

    private int promotion;
    private static final int PROMOTION_EN_POURCENTAGE = 20;

    SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);

        miseAJourPrixSejour();
    }

    @Override
    public void miseAJourPrixSejour() {
        int prixInitial = getNbNuits() * getLogement().getTarifParNuit();
        promotion = prixInitial * PROMOTION_EN_POURCENTAGE / 100;
        prix = prixInitial - promotion;
    }

    public boolean aUnNombreNuitsCorrect() {
        return (getNbNuits() >= 6) && (getNbNuits() <= 31);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le prix de ce séjour long est de " + prix + "€" + " car il comprend une réduction de " + promotion + "€");
    }
}
