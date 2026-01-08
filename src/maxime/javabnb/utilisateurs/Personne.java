package maxime.javabnb.utilisateurs;


public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nomPersonne, String prenomPersonne, int agePersonne)  {
        nom = nomPersonne;
        prenom = prenomPersonne;
        age = agePersonne;
    }

    public void afficher() {
        System.out.println("Bonjour " + prenom + " " + nom + " (" + age + " ans)");
    }
}
