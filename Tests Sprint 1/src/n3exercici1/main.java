package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args) {
        int opcio, puntuacio, preu;
        String nom, dni, resposta;
        String titular, text, competicio, club, jugador;

        do{
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
                    crearRedactor(nom,dni);
                    break;
                case 2:
                    System.out.println("Introdueixi el DNI del redactor que vol eliminar :");
                    dni = entrada.next();
                    System.out.println("Está segur de voler eliminar el redactor? S'eliminarà permanentment.");
                    resposta = entrada.next();
                    if (resposta.equalsIgnoreCase("si")){
                        eliminarRedactor(dni);
                    }else {
                        System.out.println("No s'ha eliminat el redactor.");
                    }
                    break;
                case 3:
                    System.out.println("Introdueixi el DNI del redactor al que vol afegir la notícia: ");
                    dni = entrada.next();
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

        } while(opcio !=0);{
            System.out.println("Ha sortit del menú. Fins aviat.");

        }


    }

    public static void crearRedactor(String nom, String dni){
        redactors.add(new Redactor(nom,dni));
        System.out.println("S'ha creat el redactor " + nom + " amb dni " + dni + " correctament." );
    }

    public static void eliminarRedactor(String dni){
        int posicio = redactors.indexOf(dni);
        if(posicio != -1){
            redactors.remove(posicio);
            System.out.println("S'ha eliminat el redactor correctament");
        } else {
            System.out.println("No s'ha trobat el redactor amb el dni indicat.");
        }

    }

    public static void afegirNoticia(String dni, String titular, String competicio,String club, String jugador){
        int opcio;
        int posicio = redactors.indexOf(dni);
        if(posicio != -1){
            System.out.println("Escriu el titular: ");
            titular = entrada.next();
            System.out.println("Escolleix el tipus de notícia a crear: \n" +
                    "1. Fútbol\n" +
                    "2. Básquet\n" +
                    "3. Tenis \n" +
                    "4. F1 \n" +
                    "5. Motociclisme.");
            opcio = entrada.nextInt();
            switch(opcio){
                case 1:
                    System.out.println("A quina competició fa referència aquesta notícia de futbol?");
                    competicio = entrada.nextLine();
                    System.out.println("A quin club fa referència aquesta notícia de futbol?");
                    club = entrada.nextLine();
                    System.out.println("A quin jugador fa referència aquesta notícia de futbol?");
                    jugador = entrada.next();

                    int indice = redactors.indexOf(dni);
                    redactors.


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } else {
            System.out.println("No s'ha trobat el redactor amb el dni indicat.");
        }
    }


    /*public static void buscarRedactor(String dni){
        int posicio = -1;
        for (int i = 0; i < redactors.size(); i++) {
            if (redactors.get(i).equals(dni)) {
                posicio = i;
                break;
            }
    }
        //Otro método:
        int posicio = redactors.indexOf(dni);
         */
}
