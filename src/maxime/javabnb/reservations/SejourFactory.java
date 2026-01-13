package maxime.javabnb.reservations;

import maxime.javabnb.logements.Logement;

import java.util.Date;

public class SejourFactory {

    private SejourFactory() {}

    public static Sejour creerSejour(int nbNuits, Date date, Logement logement, int nbVoyageurs) {
        Sejour sejour;

        if (nbNuits <= 5) {
            sejour = new SejourCourt(date, nbNuits, logement, nbVoyageurs);
        } else {
            sejour = new SejourLong(date, nbNuits, logement, nbVoyageurs);
        }

        return sejour;
    }

}