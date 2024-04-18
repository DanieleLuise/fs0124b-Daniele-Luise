package Esercizio1;

public class Dipendente {

    private String matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento( Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente( String matricola, int stipendio,  Dipartimento dipartimento ) {
        this.matricola =  matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }




}

