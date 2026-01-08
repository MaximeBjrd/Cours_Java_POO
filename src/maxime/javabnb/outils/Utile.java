package maxime.javabnb.outils;

import java.util.Date;

public class Utile {

    private Utile() {
        throw new UnsupportedOperationException();
    }

    /**
     * Méthode qui permet de créer une date avec les params
     *
     * @param jour Le jour de la date, compris entre 1 et 31
     * @param mois Le mois de la date, compris entre 1 pour Janvier et 12 pour Décembre
     * @param annee L'année de la date
     * @return La date bien initialisée
     */
    public static Date creerDate(int jour, int mois, int annee) {
        return new Date(annee-1900, mois-1, jour);
    }

    public static String formatDate(Date date) {
        String str = date.getDate()
                + "/" + (date.getMonth()+1)
                + "/" + (date.getYear()+1900);

        return str;
    }
}
