package Tp3;

/**
 * Created by Oussama on 23/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        double r=6.9;
        Point p = new Point(5, 7);
        Point p1 = new Point(-3, 9);

        System.out.println("l image du point p est: " + p.symmetrie().getX() + "," + p.symmetrie().getY());

        Segment s = new Segment(p, p1);
        System.out.println("l image du segment s est: " + s.symmetrie().p1.getX() + "," + s.symmetrie().p1.getY() + "/" + s.symmetrie().p2.getX() + "," + s.symmetrie().p2.getY());

        Cercle c = new Cercle(r,p);

        System.out.println("le perimetre de c est: "+c.perimetre());
        System.out.println("l image du cercle c est:"+ c.symmetrie().centre.getX()+","+c.symmetrie().centre.getY()+"/"+c.symmetrie().rayon);

    }
}
