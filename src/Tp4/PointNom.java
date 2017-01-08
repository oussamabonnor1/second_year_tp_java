package Tp4;

/**
 * Created by Oussama on 30/10/2016.
 */
public class PointNom extends PointA{
    private Character c;
    private int x,y;

    public PointNom( int x1, int y1, Character c) {
       super(x1,y1);
        this.c= c;
    }

    public Character getC() {
        return c;
    }

    public void afficherNom(){
        System.out.println("Le Point "+getC()+" : ("+super.getX()+","+super.getY()+")");
    }

}
