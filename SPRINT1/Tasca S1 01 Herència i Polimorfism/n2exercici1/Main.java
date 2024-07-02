package n2exercici1;

public class Main {

	public static void main(String[] args) {
		// Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.

		Smartphone movil = new Smartphone("Samsung","Galaxy");
		movil.alarma();
		movil.fotografiar();
		movil.trucar("608236148");
		
	}

}
