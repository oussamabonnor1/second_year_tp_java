package Tp4;

/**
 * Created by Oussama on 30/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Point a = new Point(0.5, 4);
        PointA b = new PointA(6);
        PointNom c = new PointNom(5,6,'p');
        b.afficher();
        a.deplacer(5,7);
        System.out.println("test point: "+a.getX()+","+a.getY());

        c.afficherNom();

    }

}
