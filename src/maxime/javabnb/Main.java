package maxime.javabnb;

import maxime.javabnb.logements.Logement;
import maxime.javabnb.reservations.Sejour;
import maxime.javabnb.utilisateurs.Personne;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne maxB = new Personne("Bjrd", "Max", 25);
        Personne benM = new Personne("Mtr", "Ben", 38);
        Personne samM = new Personne("Msq", "Sam", 23);

        Logement logement_1 = new Logement(maxB, 50, "8 rue des Alouettes, 37000 Tours", 180, 15);

        Date date_1 = new Date(126, Calendar.JANUARY, 10);

        Sejour sejour_1 = new Sejour(date_1, 3, logement_1, 2);
        sejour_1.afficher();
    }
}
