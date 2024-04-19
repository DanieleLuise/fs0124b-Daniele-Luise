package MainPro;

import Classi.ElementoMultimediale;
import Classi.audio;
import Classi.video;
import Classi.immagine;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Creo e utilizzo gli oggetti
        audio a = new audio("test",4,5);
            a.esegui();
            a.abbassaVolume();  //faccio le varie azioni
            a.alzaVolume();

        video v = new video("test2",5,7,3);
            v.aumentaLuminosità();
                                    //faccio le varie azioni
            v.abbassaLuminosità();


        immagine i = new immagine("test3",3);
            i.esegui();
            i.abbassaLuminosità();      //faccio le varie azioni
            i.aumentaLuminosità();

    }


}