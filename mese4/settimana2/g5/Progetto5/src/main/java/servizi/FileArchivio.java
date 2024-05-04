package servizi;

import data.Catalogo;
import data.Libri;
import data.Periodicità;
import data.Riviste;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FileArchivio implements Archivio {

    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);

    private final EntityManager em = Persistence.createEntityManagerFactory("postgres").createEntityManager();

    private final ArrayList<Catalogo> listaCatalogo = new ArrayList<>();

    // File CSV di destinazione
    private File f = new File("./catalogo.csv");

    // Metodo per salvare i cataloghi nel file CSV

    public void save(Catalogo cat) {
        var t = em.getTransaction();
        t.begin();
        em.persist(cat);
        t.commit();


    }

    // Metodo per caricare i cataloghi dal file CSV

    // Aggiungo un nuovo catalogo alla lista e salva l'archivio aggiornato
    @Override
    public void add(Catalogo catalogo) {

    }
    // Rimuovo un catalogo in base all'ISBN e salva l'archivio aggiornato
    @Override
    public void deleteISBN(Integer ISBN) {

    }

    @Override
    public Optional<Catalogo> getISBN(Integer ISBN) {
        try {
            var c = (Catalogo) em.createNamedQuery(Queries.GET_ISBN).setParameter("id", listaCatalogoId).getSingleResult();
            return Optional.of(c);
        } catch (Exception ex) {
            log.error("Exception searching catalogo by id", ex);
            return Optional.empty();
        }
    }

    @Override
    public Optional<Catalogo> getAnno(Integer anno) {
        return Optional.empty();
    }

    @Override
    public void getAutore(String autore) {

    }

}

    @Override
    public Optional<Catalogo> getAnno(Integer anno) {
        return Optional.empty();
    }

    @Override
    public void getAutore(String autore) {
        // Trova un catalogo per ISBN e restituisci un Optional
        listaCatalogo.stream().filter(el -> el instanceof Libri && ((Libri) el).getAutore().equals(autore)).forEach(System.out::println);
    }

    }

