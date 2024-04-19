package Esercizio1;

public class DipendentePart extends Dipendente{
        protected int oreLavorate;
        protected double salarioOrario;


    public DipendentePart(String matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
            this.salarioOrario = salarioOrario;
            this.oreLavorate = oreLavorate;
    }


    public double calculateSalary(){

        return salarioOrario * oreLavorate;
    }

}
