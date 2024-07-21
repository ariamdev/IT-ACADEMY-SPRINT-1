package n1exercici2;

public class Cotxe {
	
	private static final String marca = "Seat";
	private static String model = "panda"; 
	private final int potencia = 140; 
		
	
	public Cotxe() {
	}
	
	
	static void frenar () {
		System.out.println ( "El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

}
