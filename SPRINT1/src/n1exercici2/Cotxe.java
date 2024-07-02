package n1exercici2;

public class Cotxe {
	
	static final String marca = "Seat"; //Static (común) y final (no se puede cambiar).
	static String model = "panda"; //Static (comun pertenece a la clase)
	final int potencia = 140; //final (no se podrá cambiar)
		
	
	public Cotxe() {
	}
	
	
	static void frenar () {
		System.out.println ( "El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

}
