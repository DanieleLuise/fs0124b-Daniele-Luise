package servizi;
import java.util.List;
import java.util.Optional;
import data.Catalogo;
import data.Prestito;

public interface Archivio {
    // Metodo per salvare i cataloghi nel file CSV
    void save(Catalogo cat);


    void deleteISBN(Integer ISBN);
    public List<Catalogo> getByAutore(String autore);
    public List<Catalogo> getAnno(Integer annoPubblicazione);
    public Catalogo getByTitolo(String titolo);

    public List<Catalogo> getElementiInPrestito(Integer numeroTessera);

    public List<Prestito> getPrestitiScadutiNonRestituiti();

    Optional<Catalogo> getISBN(Integer ISBN);


}
