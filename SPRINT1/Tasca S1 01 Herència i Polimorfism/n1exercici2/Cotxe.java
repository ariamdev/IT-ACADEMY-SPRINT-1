package n1exercici2;

public class Cotxe {

	private static final String marca= "Seat";
        private static String model = "panda";
        private final int potencia; 

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    public static String getMarca(){
        return marca;
    }

    public static String getModel() {
        return model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    static void frenar () {
            System.out.println ( "El vehicle està frenant");
        }

        public void accelerar() {
            System.out.println("El vehicle està accelerant");
        }

    @Override
    public String toString() {
        return " Marca cotxe: " + marca + " model " + model +
                " amb potència " + potencia + " CV.";
    }

}
