package maxime.javabnb;

import maxime.javabnb.logements.Logement;
import maxime.javabnb.reservations.Sejour;
import maxime.javabnb.utilisateurs.Personne;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne maxB = new Personne("Bjrd", "Max", 25);
        Personne benM = new Personne("Mtr", "Ben", 38);
        Personne samM = new Personne("Msq", "Sam", 23);
//        maxB.afficher();
//        benM.afficher();
//        samM.afficher();

        Logement logement = new Logement(maxB, 50, "8 rue des Alouettes, 37000 Tours", 180, 15);
        logement.afficher();

        Date dateArrivee;

        Sejour sejour = new Sejour(05/07/2026, 2, logement, 3);
    }
}
