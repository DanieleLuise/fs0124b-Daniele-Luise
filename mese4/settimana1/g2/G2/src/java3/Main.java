package java3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("inserisci una stringa: ");
        String input = scanner.nextLine();
        if(input.equals("q")){
            System.out.print("sei fuori dal programma.");
            break;
        }
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            if(i != input.length() -1){
                System.out.print(",");
            }
        }
        System.out.println();



        }
        scanner.close();
    }
}
