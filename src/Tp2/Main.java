package Tp2;

import java.util.Scanner;

/**
 * Created by Oussama on 16/10/2016.
 */
public class Main {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Pour une Personne:");
        System.out.println("entrer le Nom: ");
        String nom = r.next();
        System.out.println("entrer le Prenom: ");
        String prenom = r.next();
        System.out.println("entrer l'adresse: ");
        String adresse = r.next();

        PhisicalHumain h = new PhisicalHumain(nom, prenom, adresse);
        h.identification();

        System.out.println("Pour une entreprise: ");
        System.out.println("entrer le nom: ");
        nom = r.next();
        System.out.println("entrer le Numero: ");
        int n = r.nextInt();

        Entreprise e = new Entreprise(nom,n);
        e.identification();

        System.out.println("Pour un Compte1: info sur proprio:\n");
        System.out.println("entrer le sold: ");
        int solde = r.nextInt();
        System.out.println("entrer le Numero: ");
        n = r.nextInt();
        Compte c = new Compte(n,solde,h);
        System.out.println(c.toString());

        System.out.println("Pour un Compte2:\ninfo sur proprio:\n");
        System.out.println("entrer le sold: ");
        solde = r.nextInt();
        System.out.println("entrer le Numero: ");
        n = r.nextInt();
        Compte c2=  new Compte(n,solde,e);

        System.out.println(c2.toString());



    }
}
