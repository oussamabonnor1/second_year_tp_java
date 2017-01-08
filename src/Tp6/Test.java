package Tp6;

/**
 * Created by Oussama on 27/11/2016.
 */
public class Test {
    public static void main(String[] args) {

        Except obj = new Except();
        System.out.println("debut program");
        try {
            obj.meth();
        } catch (ExceptionPerso e) {
            System.out.println(e.getMessage());
        }
        System.out.println("fin pg");
    }
}
