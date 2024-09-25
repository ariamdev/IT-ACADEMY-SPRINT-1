package n3exercici1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcio;
        int files, seients;

        System.out.println("Benvingut. Indiqui quantes files té la sala del cinema: ");
        files = sc.nextInt();
        System.out.println("Indiqui quants seients per fila té la sala de cinema:");
        seients = sc.nextInt();

        do {
            System.out.println("MENÚ CINEMA: \n" +
                    "1. Mostrar totes les butaques reservades. \n" +
                    "2. Mostrar les butaques reservades per una persona.\n" +
                    "3. Reservar una butaca.\n" +
                    "4. Anul·lar la reserva d’una butaca.\n" +
                    "5. Anul·lar totes les reserves d’una persona.\n" +
                    "0. Sortir.");
            opcio = sc.nextInt();
        } while(opcio != 0); {
            System.out.println("Fins aviat.");
        }
    }
}
