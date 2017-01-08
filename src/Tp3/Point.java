package Tp3;

/**
 * Created by Oussama on 23/10/2016.
 */
public class Point {

    // Attributs
    double x,y;

    // Constructeurs
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public Point(double x) {
        this.x = this.y = x;
    }


    // Methodes

    public double getX() { return x; }
    public double getY() { return y; }

    public Point symmetrie() {
        return new Point(x, -y);
    }
}
