import data.Libri;
import org.hibernate.boot.jaxb.SourceType;
import org.slf4j.LoggerFactory;


import org.slf4j.Logger;
import servizi.FileArchivio;

import java.net.SocketOption;

public class Main {
        Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        var FileArchivio = new FileArchivio();
        Libri libri1 = new Libri("Feee",2023,23,"daniele","trash");
        Libri libri2 = new Libri("ggg",2022,32,"gio","giallo");


       // FileArchivio.save(libri1);
       // FileArchivio.save(libri2);

        //FileArchivio.getByAutore("daniele");
       // FileArchivio.deleteISBN(103);
        System.out.println(FileArchivio.getByAutore(libri2.getAutore()));
    }
}