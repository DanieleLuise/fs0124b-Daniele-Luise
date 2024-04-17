package Telefono;

public class Sim {

    private int numero;
    private int credito;
    private Chiamata[] listaChiamate;


    public Sim(){
        numero = 123456789;
        credito = 0;
        listaChiamate = new Chiamata[5];
    }
    public void Sim(int numeroTel){
        numero = numeroTel;
    }

    public void stampaDati(){
        System.out.println("numero di telefono: "+ numero);
        System.out.println("credito residuo: "+ credito);
        System.out.println("ultime 5 chiamate: ");

        for (int i = 0; i < listaChiamate.length; i++)
         System.out.println(listaChiamate[i]);
    }
}
