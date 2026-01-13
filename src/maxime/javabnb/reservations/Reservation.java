package maxime.javabnb.reservations;

import maxime.javabnb.outils.Utile;
import maxime.javabnb.utilisateurs.Voyageur;

import java.util.Date;

public class Reservation {

    private final Reservable objetReservable;
    private final Voyageur voyageur;
    private final Date dateReservation;

    public Reservation(Reservable objetReservable, Voyageur voyageur) throws Exception {
        if(!objetReservable.aUneDateArriveeCorrecte()) throw new Exception("La date d'arrivée n'est pas correcte.");
        if(!objetReservable.aUnNombreNuitsCorrect()) throw new Exception("Le nombre de nuits n'est pas correct.");
        if(!objetReservable.aUnNombreVoyageursCorrect()) throw new Exception("Le nombre de voyageurs n'est pas correct.");

        this.objetReservable = objetReservable;
        this.voyageur = voyageur;
        this.dateReservation = new Date();
    }

    public void afficher() {
        System.out.println("Date de la réservation: " + Utile.formatDate(dateReservation));
        System.out.print("Voyageur: ");
        voyageur.afficher();
        System.out.println("A réservé chez ");
        objetReservable.afficher();
    }

}
