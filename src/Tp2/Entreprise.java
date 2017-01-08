package Tp2;

/**
 * Created by Oussama on 06/12/2016.
 */
public class Entreprise implements client {
    private String nom;
    private int numero;

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public Entreprise(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    @Override
    public void identification() {
       toString();
    }

    @Override
    public String toString() {
        String a ="Entreprise: \n"+ "Nom: " + getNom()+"\nNumero: "+getNumero();
        return a;
    }
}
