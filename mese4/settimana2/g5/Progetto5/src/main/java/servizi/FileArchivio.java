package servizi;

import data.Catalogo;
import data.Prestito;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Optional;

public class FileArchivio implements Archivio {

    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");

    protected EntityManager em = emf.createEntityManager();




    // File CSV di destinazione
    private File f = new File("./catalogo.csv");

    // Metodo per salvare i cataloghi nel file CSV
    @Override
    public void save(Catalogo cat) {
        var t = em.getTransaction();
        t.begin();
        em.persist(cat);
        t.commit();


    }





    // Rimuovo un catalogo in base all'ISBN
    @Override
    public void deleteISBN(Integer ISBN) {

    }

    @Override
    public List<Catalogo> getByAutore(String autore) {

        try {
            var query = em.createNamedQuery("GET_AUTORE");

            query.setParameter("AUTORE", autore);

            List<Catalogo> result = query.getResultList();

            return result;

        }catch (Exception e) {
            logger.error("Elemento con ISBN spec non esiste", e);
            return null;
        }

    }
    @Override
    public List<Catalogo> getAnno(Integer AnnoPubblicazione) {
        try {
            var query = em.createNamedQuery("GET_BY_ANNO");
            query.setParameter("AnnoPubblicazione", AnnoPubblicazione);
            List<Catalogo> result = query.getResultList();
            return result;
        }catch (Exception e) {
            logger.error("Nessun libro uscito in questo anno nel catalogo", e);
            return null;
        }
    }



    @Override
    public Catalogo getByTitolo(String titolo) {
        return null;
    }

    @Override
    public List<Catalogo> getElementiInPrestito(Integer numeroTessera) {
        return List.of();
    }

    @Override
    public List<Prestito> getPrestitiScadutiNonRestituiti() {
        return List.of();
    }

    @Override
    public Optional<Catalogo> getISBN(Integer ISBN) {
        try {
            var query = em.createNamedQuery("GET_ISBN");
            query.setParameter("ISBN", ISBN);
            var cat = (Catalogo) query.getSingleResult();
            return Optional.of(cat);
        } catch (Exception e) {
            logger.error("Exception searching catalogo by id", e);
            return Optional.empty();
        }
    }


}










