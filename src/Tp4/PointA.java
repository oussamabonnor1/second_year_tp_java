package Tp4;

/**
 * Created by Oussama on 30/10/2016.
 */
public class PointA extends Point{

    public PointA(double x, double y){
        super(x,y);
    }

    public PointA(double x){
       super(x);
    }

    public PointA(){
        super();
    }
    public void afficher(){
        System.out.println("Le Point: ("+super.getX()+","+super.getY()+")");
    }
}
