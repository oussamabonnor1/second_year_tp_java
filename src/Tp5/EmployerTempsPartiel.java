package Tp5;

/**
 * Created by Oussama on 06/11/2016.
 */
public class EmployerTempsPartiel extends Employed {

    double salaireHoraire;

    public EmployerTempsPartiel(String nom, String fonction) {
        super(nom, fonction);
    }

    public void setSalaireHoraire(double d) {
        salaireHoraire = d;
    }

    public double getSalaireHoraire() { return salaireHoraire; }

    public void calculeSalaire(int heur){
        super.setSalaire(getSalaireHoraire() * heur);
    }
}
