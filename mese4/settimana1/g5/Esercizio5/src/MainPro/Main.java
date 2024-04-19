package MainPro;

import Classi.ElementoMultimediale;
import Classi.audio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        audio a = new audio("test",4,5);
            a.esegui();
            a.abbassaVolume();
            a.alzaVolume();

    }

}