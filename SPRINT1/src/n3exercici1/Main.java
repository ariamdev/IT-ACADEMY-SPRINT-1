package n3exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcio;
		String nom, dni;
	
		Scanner entrada = new Scanner (System.in);
		
		//Bucle while (repetir hasta que se escoja salir del menú)
		System.out.println("MENÚ:\n"
				+ "1. Introduir redactor.\n"
				+ "2. Eliminar redactor.\n"
				+ "3. Introduir notícia a un redactor.\n"
				+ "4. Eliminar notícia\n" //(ha de demanar redactor i titular de la notícia)
				+ "5. Mostrar totes les notícies per redactor.\n"
				+ "6. Calcular puntuació de la notícia.\n"
				+ "7. Calcular preu-notícia.\n"
				+ "0. Sortir del menú.");
		opcio = entrada.nextInt();
		switch(opcio) {
		case 1:
			System.out.println("Introdueixi el nom del redactor: ");
			nom = entrada.next();
			System.out.println("Introdueix el DNI del redactor: ");
			dni = entrada.next();
			Redactor nouEmpleat = new Redactor(nom,dni);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}

	}
	
	public void crearRedactor(String nom, String dni) {
		
	}

}
