package maxime.javabnb.utilisateurs;

public class Hote extends Personne {

    private int delaiReponse;

    public Hote(String nom, String prenom, int age, int delaiReponse) {
        super(nom, prenom, age);
        this.delaiReponse = delaiReponse;
    }

    @Override
    public void afficher() {
        super.afficher();
        if(delaiReponse == 1) {
            System.out.println(" qui s'engage à répondre dans l'heure.");
        }
        else {
            System.out.println(" qui s'engage à répondre dans les " + delaiReponse + " heures.");
        }
    }

}
