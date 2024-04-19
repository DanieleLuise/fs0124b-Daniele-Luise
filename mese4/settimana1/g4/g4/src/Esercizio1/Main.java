package Esercizio1;


public class Main {


    public static void main(String[] args) {

        Dipendente Antonio = new Dipendente("Schipani",10000,Dipartimento.AMMINISTRAZIONE);
        Dipendente Andrea = new Dipendente("Andrea",4000,Dipartimento.AMMINISTRAZIONE);
        Dipendente Simone = new Dipendente("Simone",4000,Dipartimento.AMMINISTRAZIONE);

        Dipendente dipendenteFull = new DipendenteFull( "DipendenteFull",300, Dipartimento.AMMINISTRAZIONE);
        DipendentePart dipendentePart = new DipendentePart("dipendentePart", 0,Dipartimento.AMMINISTRAZIONE);
        Dipendente [] dipendente = {Antonio,Andrea,Simone,dipendenteFull,dipendentePart};
        for (int i = 0; i < dipendente.length; i++){
            System.out.print(dipendente[i].getMatricola());
            System.out.println(dipendente[i].getStipendio());
        }
           System.out.println("stipendio part time" + dipendentePart.calculateSalary());
    }


}