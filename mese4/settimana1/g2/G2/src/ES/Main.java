package ES;


public class Main {

    public static void main(String[] args) {

     String esempio = "prova";

     System.out.println("lunghezza pari? " + stringaDispari(esempio));

     int anno = 2024;

        System.out.print(annoBisestile(2024));
    }



    public static boolean stringaDispari(String str ){
        return str.length() %2 == 0;
    }


    public static boolean annoBisestile(int anno){
       boolean verificaQuattro = anno  % 4 == 0 ;
       boolean verificaCento = anno % 100 == 0;
       boolean verificaQuattroCento = anno % 400 == 0;
       if (verificaQuattro && !verificaCento || verificaQuattroCento){
           return true;}
       else {
           return false;
       }



    }



}