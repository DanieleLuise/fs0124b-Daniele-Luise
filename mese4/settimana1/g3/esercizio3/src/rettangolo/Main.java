package rettangolo;


public class Main {

public static void stampaRettangolo(Rettangolo e){
    System.out.println("area: " + e.area() + " perimetro: " + e.perimetro());

}

    public static void main(String[] args) {

     Rettangolo rettangolo1 = new Rettangolo(3, 8);
     stampaRettangolo(rettangolo1);

    }





}
