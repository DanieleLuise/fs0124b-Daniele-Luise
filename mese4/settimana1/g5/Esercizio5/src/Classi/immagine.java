package Classi;

public class immagine extends ElementoMultimediale implements Luminosità {
    private int luminosità;
    private static final int lumMax = 1;
    private static final int lumMin = 5;

    public immagine(String titolo,int luminosità) {
        super(titolo);
        this.luminosità = convertiPositivo(luminosità);

    }

    private int convertiPositivo(int valore) {
        if(valore < 0) valore = -valore;
        return valore;
    }

    @Override
    public void esegui() {
    show();
    }

    private void show() {
        String livelloLuminosità = "";
        for (int i = 0; i < luminosità; i++){
            livelloLuminosità += "*";
        }
        for (int i = 0; i < luminosità; i++){
            System.out.println(titolo + livelloLuminosità);
        }
    }

    @Override
    public void aumentaLuminosità() {
        if (luminosità != lumMax) luminosità++;
        else System.out.println("luminosità massima");
        System.out.println("nuova luminosità: " + luminosità);
    }

    @Override
    public void abbassaLuminosità() {
        if (luminosità != lumMin) luminosità--;
        else System.out.println("volume minimo");
        System.out.println("nuova luminosità; "+luminosità);
    }
}
