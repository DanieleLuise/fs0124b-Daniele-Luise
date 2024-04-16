package java4;
import java.util.Scanner;
public class main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero: ");
        int numero = scanner.nextInt();

        System.out.println("conto alla rovescia");
        for(int i = numero; i >= 0; i-- ){
            System.out.println(i);
        }

        scanner.close();
    }

}
