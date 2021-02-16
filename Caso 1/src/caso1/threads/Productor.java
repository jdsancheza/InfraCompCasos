package caso1.threads;

public class Productor extends Thread{
    /**
     * Tipo del producto a producir, puede ser A o B
     */
    public boolean tipo;

    public Productor(boolean tipo){
        this.tipo = tipo;
    }
}
