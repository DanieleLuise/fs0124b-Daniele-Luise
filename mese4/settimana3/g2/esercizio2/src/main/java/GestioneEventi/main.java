package GestioneEventi;


import java.time.LocalDate;
import java.util.ArrayList;

import static GestioneEventi.tipoEvento.Privato;
import static GestioneEventi.tipoEvento.Pubblico;


public class main {

    static final String PERSISTENCE_UNIT = "postgres";

    public static void main(String[] args) {

       ArrayList<evento> lista = new ArrayList<>();

        evento evento1 = new evento(1,"sagra", LocalDate.of(2023, 1, 1),"mbho",Privato,3);
        evento evento2 = new evento(2,"comicon", LocalDate.of(2023, 3, 3),"mbho",Pubblico,20);

        lista.add(evento1);
        lista.add(evento2);

        System.out.println(lista);

    }
}
