package servizi;

import data.Catalogo;

import java.util.ArrayList;
import java.util.Optional;

public class FileArchivio implements Archivio{

    private final ArrayList<Catalogo> listaCatalogo = new ArrayList<>();
    @Override
    public void add(Catalogo catalogo) {
        listaCatalogo.add(catalogo);
    }

    @Override
    public void deleteISBN(int ISBN) {
        listaCatalogo.removeIf(e -> e.getISBN().equals(ISBN));
    }

    @Override
    public Optional<Catalogo> getISBN(Integer ISBN) {
        var elemento = listaCatalogo.stream()
                .filter(catalogo -> catalogo.getISBN().equals(ISBN))
                .findFirst();
        return elemento;

    }

    @Override
    public void getAnno(int anno) {

    }

    @Override
    public void getAutore(String autore) {

    }
}
