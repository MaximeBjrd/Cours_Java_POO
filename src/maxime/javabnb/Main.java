package maxime.javabnb;

import maxime.javabnb.logements.Appartement;
import maxime.javabnb.logements.Logement;
import maxime.javabnb.logements.Maison;
import maxime.javabnb.outils.Utile;
import maxime.javabnb.reservations.*;
import maxime.javabnb.utilisateurs.Hote;
import maxime.javabnb.utilisateurs.Personne;
import maxime.javabnb.utilisateurs.Voyageur;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Personne maxB = new Personne("Bjrd", "Max", 25);
        Personne benM = new Personne("Mtr", "Ben", 38);
        Personne samM = new Personne("Msq", "Sam", 23);

        Hote emyB = new Hote("Bdn", "Emy", 27, 3);
//        emyB.afficher();

        Voyageur voyageur_1 = new Voyageur("Prn", "Alex", 25);

//        Logement logement_1 = new Logement(emyB, 50, "8 rue des Alouettes, 37000 Tours", 180, 15);
//        logement_1.afficher();

        Maison maison_1 = new Maison(emyB, 74, "8 rue des Alouettes, 37000 Tours", 180, 15, 400, true);
//        maison_1.afficher();

        Appartement appartement_1 = new Appartement(emyB, 31, "36 avenue des Chameaux, 37000 Tours", 43, 3, 7, 2);
//        appartement_1.afficher();

        // --- CRITERES POUR LA CREATION D'UN SEJOUR COURT OU LONG ---
        Date date_2 = Utile.creerDate(30, 6, 2026);
        int nbNuits = 8;
        Logement logement = maison_1;
        int nbVoyageurs = 2;

        Sejour sejour_1 = SejourFactory.creerSejour(nbNuits, date_2, logement, nbVoyageurs);

        try {
            Reservation reservation_1 = new Reservation(sejour_1, voyageur_1);
            reservation_1.afficher();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
