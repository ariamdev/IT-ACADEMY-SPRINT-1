package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		Cotxe cotxe1 = new Cotxe ();
		
		System.out.println(cotxe1.potencia); //Pertenece al objeto
		System.out.println(Cotxe.marca); //Pertenece a la clase
		System.out.println(Cotxe.model); //Pertenece a la clase
		
		
		Cotxe.model = "Ibiza";
		Cotxe.frenar(); //pertenece a la clase (static)
		cotxe1.frenar(); //cotxe1 pertenece a Cotxe por eso se puede ejecutar
		cotxe1.accelerar(); //pertenece al objeto
		
	}

}
