package maxime.javabnb.logements;

import maxime.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {

    private int superficieBalcon;
    private int numeroEtage;

    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieBalcon, int numeroEtage) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon = superficieBalcon;
        this.numeroEtage = numeroEtage;
    }

    @Override
    public void afficher() {
        getHote().afficher();

        System.out.println("L'adresse de l'appartement est: " + getAdresse() + " et il est au "+ (numeroEtage==0 ? "Rez de chaussée" : (numeroEtage==1 ? "1er étage" : numeroEtage + "e étage")));
        System.out.println("Superficie: " + getSuperficie() + "m²");
        System.out.println("Nombre max de voyageurs: " + getNbVoyageursMax() + "p.");

        if(superficieBalcon == 0) {
            System.out.println("Balcon: Non");
        }
        else {
            System.out.println("Balcon: Oui (" + superficieBalcon + "m²)");
        }
    }

}
