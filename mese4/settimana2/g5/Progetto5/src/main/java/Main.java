import data.Libri;
import org.slf4j.LoggerFactory;


import org.slf4j.Logger;
import servizi.FileArchivio;

public class Main {

    public static void main(String[] args){

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Ciao");
    Libri libro1 = new Libri("luca",2023,20,"dipe","maschio");
    Libri libro2 = new Libri("mario",2022,30,"varano","maschio");
    Libri libro3 = new Libri("fede",2021,50,"mass","maschio");

    FileArchivio archivio = new FileArchivio();

    archivio.add(libro1);
    archivio.add(libro2);
    archivio.add(libro3);



   System.out.println(archivio.getLista());

    }
}
