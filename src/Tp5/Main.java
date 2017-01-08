package Tp5;

/**
 * Created by Oussama on 06/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        Employed salim = new Employed("Salim", "PDG");
        EmployerPleinTemps halima = new EmployerPleinTemps("Halima", "Secretaire");
        EmployerTempsPartiel abdelhalim = new EmployerTempsPartiel("Abdelhalim", "Agent de Securite");

        salim.setSalaire(100000.0);
        halima.setSalairSemain(7000.0);
        abdelhalim.setSalaireHoraire( 150.0);

        salim.affiche();
        halima.calculeSalaire();
        abdelhalim.calculeSalaire(35);

        halima.affiche();
        abdelhalim.affiche();
    }
}
