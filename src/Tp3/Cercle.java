package Tp3;

/**
 * Created by Oussama on 23/10/2016.
 */
public class Cercle {

    // Attributs
    public double rayon;
    public Point centre;


    // Constructeurs

    public Cercle(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }


    public Cercle(double rayon) {
        this (rayon, new Point(0, 0));
    }



    // Methods

    public double perimetre() {
        return 2*Math.PI*rayon;
    }


    public Cercle symmetrie() {
        return new Cercle (rayon, centre.symmetrie());
    }
}
