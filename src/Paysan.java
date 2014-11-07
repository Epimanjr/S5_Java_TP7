/**
 *
 * @author Maxime BLAISE
 * @author Antoine NOSAL
 */
public class Paysan {
    
    /**
     * Age du paysan.
     */
    private int age;
    
    /**
     * Nom du paysan.
     */
    private String nom;
    
    /**
     * Prénom du paysan.
     */
    private String prenom;

    /**
     * Constructeur d'un paysan.
     * 
     * @param age ...
     * @param nom ...
     * @param prenom  ...
     */
    public Paysan(int age, String nom, String prenom) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
}
