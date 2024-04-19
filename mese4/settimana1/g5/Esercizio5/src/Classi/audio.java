package Classi;

public class audio extends ElementoMultimediale implements Riproducibili{

    private int volume;
    private int durata;
    private static final int minimo = 0;
    private static final int massimo = 0;

    public audio(String titolo, int volume,int durata) {
        super(titolo);
        this.volume = convertiPositivo(volume);
        this.durata = convertiPositivo(durata);

    }
    public int convertiPositivo(int valore){
        if(valore < 0) valore = -valore;
        return valore;
    }


    @Override
    public void play() {
    String livelloVolume = "";
    for (int i = 0; i < volume; i++){
        livelloVolume += "!";
    };
    for (int i = 0; i < durata; i++){
        System.out.println(titolo + livelloVolume);
      };
    }

    @Override
    public void alzaVolume() {
        if ( volume != massimo) volume++;
        else System.out.println("volume massimo");
        System.out.println("nuovo volume: "+volume);
    }

    @Override
    public void abbassaVolume() {
        if (volume != minimo) volume--;
        else System.out.println("volume minimo");
        System.out.println("nuovo volume: "+ volume);
    }
    @Override
    public void esegui(){
        play();
    }

    }

