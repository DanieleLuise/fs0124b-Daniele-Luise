package PrimoES;

import java.util.Random;
import java.util.Scanner;


public class Esercizio1 {
    public static void esegui() {

        int[] numeriRandom = new int[5];
        for (int i = 0; i < 5; i++){
            numeriRandom[i] = random.nextInt(10) + 1;
        }
        System.out.println("numeri random:");
        for (int numero : numeriRandom){
            System.out.println(numero);
        }
        System.out.println("inserisci un numero: ");
        int numeroInserito = scanner.nextInt(System.in);
        System.out.println("inserisci posizione numero da 0 a 4: ");
        int posizione = scanner.nextInt();

        numeriRandom[posizione] = numeroInserito;

        System.out.println("nuovo array: ");
        for(int numero : numeriRandom) {
            System.out.println(numero);
        }
    }
    }




