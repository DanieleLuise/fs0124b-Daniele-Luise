import data.Libri;
import org.slf4j.LoggerFactory;


import org.slf4j.Logger;
import servizi.FileArchivio;

public class Main {
        Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Libri libri = new Libri("Feee",2023,23,"federico","trash");

        var FileArchivio = new FileArchivio();
        FileArchivio.add(libri);
    }
}