package data;

public class Riviste extends Catalogo {

    private Periodicità periodicità;


    public Riviste(Integer ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }
}
