package servizi;
import java.util.Optional;
import data.Catalogo;

public interface Archivio {
    void add(Catalogo c);
    void deleteISBN(int ISBN);
    Optional<Catalogo> getISBN (Integer ISBN);
    void getAnno(int anno);
    void getAutore(String autore);

}
