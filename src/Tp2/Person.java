package Tp2;


/**
 * Created by Oussama on 06/12/2016.
 */
public class Person {
    private String nom;
    private String prenom;
    private String adresse;


    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public String getAdresse() {
        return adresse;
    }


    public Person(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "nom: " + getNom() + "\nprenom: " + getPrenom() + "\nadresse: " + getAdresse();
    }


}
