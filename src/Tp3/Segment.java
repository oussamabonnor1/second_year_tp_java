package Tp3;

/**
 * Created by Oussama on 23/10/2016.
 */
public class Segment {

    // Attributs
    Point p1, p2;

    // contsructeurs
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Segment(Point p) {
        this(new Point(0, 0), p);
    }


    // Methodes

    public double longueur() {
        double distanceCarre = (p2.getY()-p1.getY())*(p2.getY()-p1.getY()) + (p2.getX()-p1.getX())*(p2.getX()-p1.getX());
        return Math.sqrt(distanceCarre);
    }


    public Segment symmetrie() { return new Segment(p1.symmetrie(), p2.symmetrie()); }
}
