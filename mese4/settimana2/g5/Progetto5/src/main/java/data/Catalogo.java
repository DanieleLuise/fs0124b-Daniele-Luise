package data;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "Elemento_catalogo", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "GET_ISBN", query = "SELECT c Catalogo AS c WHERE ISBN = :ISBN")
@NamedQuery(name = "GET_ANNO", query = "SELECT c Catalogo AS c WHERE annopubblicazione = :ANNOPUBBLICAZIONE")
@NamedQuery(name = "GET_AUTORE", query = "SELECT C Catalogo AS c WHERE autore = :AUTORE")
public abstract class Catalogo {
    @Id
    @GeneratedValue
    private Integer ISBN;
    private String titolo;
    private Integer annoPubblicazione;
    private Integer numeroPagine;


    public Catalogo(String titolo, Integer annoPubblicazione, Integer numeroPagine) {

        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public Catalogo(){

    }


    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
