package Tp5;

/**
 * Created by Oussama on 06/11/2016.
 */
public class Employed {
    double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    String nom,fonction;

    public Employed(String nom, String fonction) {
        this.nom = nom;
        this.fonction = fonction;
    }

    public void affiche(){
        System.out.println("Le salaire de " + getNom() + " au poste " + getFonction() + " est: "+ getSalaire()+ " DA" );
    }

    public void calculeSalaire() {}


}
