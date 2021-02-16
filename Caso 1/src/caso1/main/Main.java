package caso1.main;

public class Main {

    /**
     * Arreglo con los números de Productores, Buzones, y Consumidore
     * [0] - ProductoresConsumidores
     * [1] - Buzones Productores
     * [2] - Buzones Consumidores
     * [3] -
     */
    public int[] config = new int[4];
    public boolean leerArchivo(){

        return true;
    }

    public static void main(String[] args) {
        Main m = new Main();
        if(m.leerArchivo()){

            // Crear consumidores y productores
            for (int i = 0; i < m.config[0]; i++) {
                if(i%2==0){

                }else{

                }

            }
        }
    }
}
