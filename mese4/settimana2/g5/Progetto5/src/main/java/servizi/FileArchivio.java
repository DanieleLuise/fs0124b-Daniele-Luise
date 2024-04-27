package servizi;

import data.Catalogo;
import data.Libri;
import data.Riviste;
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

    private final ArrayList<Catalogo> listaCatalogo = new ArrayList<>();
    private ArrayList<Catalogo> loadListaCatalogo = new ArrayList<>();

    private File f = new File("./catalogo.csv");

    public void save() {
        try {
            FileUtils.delete(f);
        } catch (IOException err) {
            IOException e = err;
            logger.error("Eccezione durante l'eliminazione", e);
        }
        listaCatalogo.stream().forEach(c -> {
            try {
                if (c instanceof Libri) {
                    var lines = Arrays.asList(c.getISBN().toString() + "," + c.getTitolo() + "," + c.getAnnoPubblicazione() + "," + c.getNumeroPagine() + "," + ((Libri) c).getAutore() + "," + ((Libri) c).getGenere());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);

                } else {
                    var lines = Arrays.asList(c.getISBN().toString(), c.getTitolo(), c.getAnnoPubblicazione(), c.getNumeroPagine(), ((Riviste) c).getPeriodicità());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);
                }

            } catch (IOException e) {
                logger.error("Eccezione:", e);
            }
        });
    }

    public void load(){
        List<String> l = leggiFile(f);
        System.out.println(loadListaCatalogo);
    }

    @Override
    public void add(Catalogo catalogo) {
        listaCatalogo.add(catalogo);
    }

    @Override
    public void deleteISBN(Integer ISBN) {
        listaCatalogo.removeIf(e -> e.getISBN().equals(ISBN));
        this.save();
    }

    @Override
    public Optional<Catalogo> getISBN(Integer ISBN) {
        var elemento = listaCatalogo.stream()
                .filter(catalogo -> catalogo.getISBN().equals(ISBN))
                .findFirst();
        return elemento;

    }

    @Override
    public Optional<Catalogo> getAnno(Integer anno) {
        return Optional.empty();
    }

    @Override
    public void getAutore(String autore) {

    }

    public List<Catalogo> getByAutore(String autore) {
        var autoreL = this.listaCatalogo.stream().filter((el) -> el instanceof Libri && ((Libri) el).getAutore().equals(autore))
                .toList();
        return autoreL;
    }

    public List<Catalogo> getByAnno(Integer anno) {
        var annoP = this.listaCatalogo.stream().filter(el -> el.getAnnoPubblicazione().equals(anno))
                .toList();
        return annoP;
    }

    public ArrayList<Catalogo> getLista() {
        return listaCatalogo;
    }
        public List<String> leggiFile (File file){
            List<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] el = line.split(",");
                    String titolo = el[1];
                    String annoPubblicazioneStr = el[2];
                    String numeroPagineStr = el[3];
                    String autore = el[4];
                    String genere = el[5];
                    int annoPubblicazione;
                    int numeroPagine;
                    try {
                        annoPubblicazione = Integer.parseInt(annoPubblicazioneStr);
                        numeroPagine = Integer.parseInt(numeroPagineStr);
                    } catch (NumberFormatException e) {
                        // Gestisci l'errore come preferisci, ad esempio stampando un messaggio di errore
                        System.err.println("Errore di conversione: " + e.getMessage());
                        // Salta questa riga e continua con la prossima iterazione del ciclo
                        continue;
                    }
                    var libro = new Libri(titolo, annoPubblicazione, numeroPagine, autore, genere);
                    loadListaCatalogo.add(libro);
                    lines.add(line);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return lines;
        }
    }

