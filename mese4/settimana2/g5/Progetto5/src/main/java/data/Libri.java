package data;

public class Libri extends Catalogo {

    private String autore;
    private String genere;

    public Libri(Integer ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }
}
