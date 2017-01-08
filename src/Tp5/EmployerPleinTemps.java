package Tp5;


public class EmployerPleinTemps extends Employed{
double Prime;
double SalairSemain;

    public EmployerPleinTemps( String nom, String fonction) {
        super( nom, fonction);

    }

    public double getPrime() {
        return Prime;
    }

    public void setPrime(double prime) {
        Prime = prime;
    }

    public double getSalairSemain() {
        return SalairSemain;
    }

    public void setSalairSemain(double salairSemain) {
        SalairSemain = salairSemain;
    }

    public void calculeSalaire(){
         super.setSalaire(getSalairSemain()*4+ getPrime());

    }

}
