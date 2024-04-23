package EsercizioS2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di parole: ");

        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        System.out.println("Inserisci le parole:");
        for(int i = 0; i < N; i++){
            String parola = scanner.nextLine();
            if(!paroleDistinte.add(parola)){
                paroleDuplicate.add(parola);
            }
        }

        scanner.close();

        System.out.println("parole duplicate: ");
        for(String parola : paroleDuplicate){
            System.out.println(parola);
        }

        System.out.println("parole distinte numero:" + paroleDistinte.size());

        System.out.println("elenco di parole distinte:");
        for(String parola : paroleDistinte){
            System.out.println(parola);
        }






    }

}