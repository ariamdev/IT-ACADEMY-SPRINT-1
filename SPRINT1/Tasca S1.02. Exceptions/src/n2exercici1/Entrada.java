package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    static Scanner sc = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        System.out.println(missatge);

        byte valorByte = 0;
        boolean valid = false;

        do {
            try {
                valorByte = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Sisplau, introdueix un Byte vàlid.");
                sc.nextLine();
            }
        } while (!valid);
        return valorByte;
    }

    public static int llegirInt(String missatge){
        System.out.println(missatge);

        int valorInt = 0;
        boolean valid = false;

        do {
            try {
                valorInt = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Sisplau, introdueix un número integrer vàlid.");
                sc.nextLine();
            }
        } while (!valid);
        return valorInt;
    }

    public static float llegirFloat(String missatge){

        System.out.println(missatge);
        float valorFloat = 0f;
        boolean valid = false;

        do {
            try {
                valorFloat = sc.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Sisplau, introdueix un número decimal (float) vàlid.");
                sc.nextLine();
            }
        }while (!valid);
        return valorFloat;
    }

    public static double llegirDouble(String missatge){

        System.out.println(missatge);
        double valorDouble = 0d;
        boolean valid = false;

        do {
            try {
                valorDouble = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Sisplau, introdueix un número decimal (double) vàlid.");
                sc.nextLine();
            }
        }while (!valid);
        return valorDouble;
    }

    public static char llegirChar(String missatge){

        System.out.println(missatge);
        char valorChar = ' ';
        boolean valid = false;

        do {
            try {
                valorChar = sc.next().charAt(0);
                valid = true;
            } catch (Exception e) {
                System.err.println("Sisplau, introdueix un únic caràcter (char) vàlid.");
                sc.nextLine();
            }
        } while (!valid);
        return valorChar;
    }

    public static String llegirString(String missatge){

        System.out.println(missatge);
        String valorString = "";
        boolean valid = false;

        do {
            try {
                valorString = sc.next();
                valid = true;
            } catch (Exception e) {
                System.err.println("Sisplau, introdueix una paraula (String) vàlida.");
                sc.nextLine();
            }
        }while (!valid);
        return valorString;
    }

    public static boolean llegirSiNo(String missatge){

        System.out.println(missatge);
        boolean booleanUsuari = false;
        boolean valid = false;
        String resposta = "";

        do {
            try {
                resposta = sc.nextLine();
                valid = true;
                if (resposta.equalsIgnoreCase("s")) {
                    booleanUsuari = true;
                    valid = true;
                } else if (resposta.equalsIgnoreCase("n")) {
                    booleanUsuari = false;
                    valid = true;
                } else {
                    System.out.println("Sisplau, introdueix una resposta vàlida.");
                    sc.nextLine();
                }
            } catch (Exception e) {
                System.err.println("Sisplau, introdueix un boolean vàlid. (s / n)");
            }
        } while (!valid);
        return booleanUsuari;
    }
}

