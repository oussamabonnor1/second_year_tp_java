package Tp2;


/**
 * Created by Oussama on 16/10/2016.
 */

interface client {
    void identification();
}

public class PhisicalHumain extends Person implements client  {

    public PhisicalHumain(String nom, String prenom, String adresse) {
        super(nom,prenom,adresse);
    }

    @Override
    public void identification() {
        System.out.println(toString());
    }
}
