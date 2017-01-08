package Tp1;

import java.util.Scanner;

/**
 * Created by Oussama on 09/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println(" entrer la valeur: " + (i+1) + "," + (j+1));
                t[i][j] = r.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j &&  t[i][j] == 0 ) {
                    System.out.println("il y a une valeur nul a : "+ (i+1) + "," + (j+1));
                }
            }
        }
    }
}
