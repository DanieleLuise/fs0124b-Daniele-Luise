package Classi;

public class video extends ElementoMultimediale implements Riproducibili, Luminosità {
    private int volume;
    private int durata;
    private int luminosità;
    private static final int minimo = 0;
    private static final int massimo = 0;
    private static final int lumMax = 5;
    private static final int lumMin = 0;
    public video(String titolo, int volume, int durata,int luminosità) {
        super(titolo);
        this.volume = convertiPositivo(volume);
        this.durata = convertiPositivo(durata);
        this.luminosità = convertiPositivo(luminosità);
    }
    public int convertiPositivo(int valore){
        if(valore < 0) valore = -valore;
        return valore;
    }

    @Override
    public void esegui() {
        play();
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



    @Override
    public void play() {
        String livelloVolume = "";
        for (int i = 0; i < volume; i++) {
            livelloVolume += "!";
        }
        ;
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + livelloVolume);
        }

        String livelloLuminosità = "";
        for (int i = 0; i < luminosità; i++){
            livelloLuminosità += "*";
        }
        for (int i = 0; i < luminosità; i++){
            System.out.println(titolo + livelloLuminosità);
        }
    }

    @Override
    public void alzaVolume() {
        if (volume != massimo) volume++;
        else System.out.println("volume massimo");
        System.out.println("nuovo volume: " + volume);
    }

    @Override
    public void abbassaVolume() {
            if (volume != minimo) volume--;
            else System.out.println("volume minimo");
            System.out.println("nuovo volume: " + volume);
        }
    }

