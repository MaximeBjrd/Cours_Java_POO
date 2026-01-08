package maxime.javabnb.logements;

import maxime.javabnb.utilisateurs.Personne;

public class Logement {
    private Personne hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Personne hoteLogement, int tarifParNuitLogement, String adresseLogement, int superficieLogement, int nbVoyageursMaxLogement) {
        hote = hoteLogement;
        tarifParNuit = tarifParNuitLogement;
        adresse = adresseLogement;
        superficie = superficieLogement;
        nbVoyageursMax = nbVoyageursMaxLogement;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public void afficher() {
        hote.afficher();
        System.out.println("Le logement est situé au " + adresse + ".");
        System.out.println("Superficie: " + superficie + "m²");
        System.out.println("Nombre max de voyageurs: " + nbVoyageursMax);
    }
}
