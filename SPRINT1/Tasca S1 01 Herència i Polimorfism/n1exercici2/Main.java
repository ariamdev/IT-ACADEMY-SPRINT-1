package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
        Cotxe cotxe1 = new Cotxe (140);

        System.out.println(cotxe1.getPotencia()); 
        System.out.println(Cotxe.getMarca());
        System.out.println(Cotxe.getModel());


        Cotxe.setModel("Ibiza");
        Cotxe.frenar(); 
        cotxe1.frenar();
        cotxe1.accelerar();

    }

}
