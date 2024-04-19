package Classi;


 //questa è la mia classe astratta che ha il metodo titolo come
 // a tutti e la uso come classe madre
public abstract class ElementoMultimediale {

        protected String titolo;
            //costruttore
        public ElementoMultimediale(String titolo){
            this.titolo = titolo;
        }

        //metodo pert ottenere il titolo
    public String getTitolo() {
        return titolo;
    }
    //questo è il metodo astratto che uso in tutte le classi
    public abstract void esegui();
}
