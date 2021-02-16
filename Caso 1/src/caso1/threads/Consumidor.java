package caso1.threads;

public class Consumidor extends Thread{

    /**
     * Tipo del producto a consumir, puede ser A o B
     */
    public boolean tipo;

    public Consumidor(boolean tipo){
        this.tipo = tipo;
    }

}
