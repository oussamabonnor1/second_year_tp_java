package Tp6;

/**
 * Created by Oussama on 27/11/2016.
 */
public class Except {
    public void meth(){
        int x = 0;
        System.out.println("avant incident");

        if (x ==0) {
            throw new ExceptionPerso("calcul erone");
        }

        System.out.println("apres accident");
    }
}
