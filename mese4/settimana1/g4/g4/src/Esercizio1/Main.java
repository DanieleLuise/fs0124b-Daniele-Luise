package Esercizio1;


public class Main {


    public static void main(String[] args) {

        Dipendente Antonio = new Dipendente("Schipani",10000,Dipartimento.AMMINISTRAZIONE);
        Dipendente Andrea = new Dipendente("Andrea",4000,Dipartimento.AMMINISTRAZIONE);
        Dipendente Simone = new Dipendente("Simone",4000,Dipartimento.AMMINISTRAZIONE);

        Dipendente [] dipendente = {Antonio,Andrea,Simone};
        for (int i = 0; i < dipendente.length; i++){
            System.out.print(dipendente[i].getMatricola());
            System.out.println(dipendente[i].getStipendio());

        }
    }


}