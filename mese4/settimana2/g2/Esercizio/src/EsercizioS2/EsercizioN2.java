package EsercizioS2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EsercizioN2 {
    public static void main(String[] args) {
        int N = 5;
        List<Integer> listaCasuale = generaListaCasuale(N);
        System.out.println("Lista casuale: " + listaCasuale);
    }

    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> listaCasuale = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            int numeroCasuale = rand.nextInt(101);
            listaCasuale.add(numeroCasuale);
        }

        Collections.sort(listaCasuale);
        return listaCasuale;
    }
}