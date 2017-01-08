package Tp2;

/**
 * Created by Oussama on 16/10/2016.
 */
public class Compte {
    int num_compte;
    int solde;
    client c;

   /* public Compte(int num_compte, int solde,PhisicalHumain h) {
        this.num_compte = num_compte;
        this.solde = solde;
        this.h=h;
    }

    public Compte(int num_compte, int solde, Entreprise e) {
        this.num_compte = num_compte;
        this.solde = solde;
        this.e = e;
    }*/

    public Compte(int num_compte, int solde, client c) {
        this.num_compte = num_compte;
        this.solde = solde;
        this.c = c;
    }

    @Override
    public String toString() {

        return "Client: "+c+"Numero du compte: "+num_compte+"\nSolde du compte: "+solde;
    }
}
