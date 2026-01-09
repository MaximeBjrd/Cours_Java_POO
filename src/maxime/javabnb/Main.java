package maxime.javabnb;

import maxime.javabnb.logements.Appartement;
import maxime.javabnb.logements.Logement;
import maxime.javabnb.logements.Maison;
import maxime.javabnb.outils.Utile;
import maxime.javabnb.reservations.Sejour;
import maxime.javabnb.utilisateurs.Hote;
import maxime.javabnb.utilisateurs.Personne;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Personne maxB = new Personne("Bjrd", "Max", 25);
        Personne benM = new Personne("Mtr", "Ben", 38);
        Personne samM = new Personne("Msq", "Sam", 23);

        Hote emyB = new Hote("Bdn", "Emy", 27, 3);
//        emyB.afficher();

        Logement logement_1 = new Logement(emyB, 50, "8 rue des Alouettes, 37000 Tours", 180, 15);
//        logement_1.afficher();

        Maison maison_1 = new Maison(emyB, 50, "8 rue des Alouettes, 37000 Tours", 180, 15, 400, true);
//        maison_1.afficher();

        Appartement appartement_1 = new Appartement(emyB, 31, "36 avenue des Chameaux, 37000 Tours", 43, 3, 0, 0);
//        appartement_1.afficher();

//        Date date_1 = new Date(126, Calendar.JANUARY, 10);
        Date date_2 = Utile.creerDate(12, 1, 2026);

        Sejour sejour_1 = new Sejour(date_2, 5, maison_1, 2);
        sejour_1.afficher();
    }

}
