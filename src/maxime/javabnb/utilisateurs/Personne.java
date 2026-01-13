package maxime.javabnb.utilisateurs;

public class Personne {

    private final String nom;
    private final String prenom;
    private final int age;

    public Personne(String nom, String prenom, int age)  {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficher() {
        System.out.println(prenom + " " + nom + " (" + age + " ans)");
    }

}
