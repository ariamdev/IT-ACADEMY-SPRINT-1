package scaperoom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Salaenigmas {

    static Scanner sc = new Scanner(System.in);
    static Set<sala> salasEnigma = new HashSet<>();
    static ArrayList<pistas> pistasSala;
    static ArrayList<objetos> objetosSala;


    public static void menu () {
        int opt;

        do {
            System.out.println("MENÚ: \n" +
                    "1. Crear una nueva sala.\n" +
                    "2. Añadir pistas a una sala específica.\n" +
                    "3. Introducir objetos de decoración para ambientar las salas.\n" +
                    "4. Mostrar el inventario actualizado, incluyendo cantidades disponibles y valor total. \n" +
                    "5. Permitir la retirada de elementos del inventario. \n" +
                    "0. Log out.");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    createSala();
                    break;
                case 2:
                    createClues();
                    break;
                case 3:
                    createObjects();
                    break;
                case 4:
                    inventory();
                    break;
                case 5:
                    removeInventory();
                    break;
            }

        }  while (opt!=0); {

            System.out.println("Bye bye!");
        }
    }

    public static sala createSala(){

        System.out.println("Choose an ID: ");
        String id = sc.next();
        System.out.println("Write the name of the room: ");
        String name = sc.next();
        sala nuevaSala = new sala(id,name);

        System.out.println("Set the lvl for the room: \n" +
                "1. EASY \n" +
                "2. MEDIUM \n" +
                "3. HARD \n ");
        int opt1 = sc.nextInt();
        try{
            switch (opt1){
            case 1:
                nuevaSala.setLvl(dificultad.EASY);
                break;
            case 2:
                nuevaSala.setLvl(dificultad.MEDIUM);
                break;
            case 3:
                nuevaSala.setLvl(dificultad.HARD);
                break;
            default:
                throw new IllegalArgumentException();
        }
    } catch (IllegalArgumentException e){
        System.err.println("Choose one of the three lvl's! ");
    }

        salasDuplicada(nuevaSala);
        salasEnigma.add(nuevaSala);
        System.out.println("The room has created successfully!");

        return nuevaSala;
    }

    public static void salasDuplicada (sala nuevaSala){
        salasEnigma.stream()
                .filter(sala -> sala.equals(nuevaSala))
                .findFirst()
                .ifPresent(sala -> System.out.println("There's another room with the same characteristics " + sala + " Please create another different."));

    }

    public static void createClues(){

        System.out.println("Choose an ID: ");
        String id = sc.next();
        System.out.println("Write a name for the clue: ");
        String name = sc.next();
        System.out.println("Set the theme for the clue: ");
        String tematica = sc.next();
        System.out.println("Set a time to solve the clue: ");
        double time = sc.nextInt();
        System.out.println("Set a price of the clue: ");
        double price = sc.nextInt();

        pistasSala.add(new pistas(id,price,name,time,tematica));

        System.out.println("Write the name of the room that you want to add the clues: ");
        String nameSala = sc.next();

        try {
            salasEnigma.stream()
                    .filter(room -> room.getName().equalsIgnoreCase(nameSala))
                    .findFirst()
                    .ifPresent(room -> room.setPistasSala(pistasSala));
            System.out.println("The clue has created correctly.");
        } catch (Exception e){
            System.out.println("There aren't a room with this name. Please create one.");
        }

    }

    public static void createObjects(){
        System.out.println("Choose an ID: ");
        String id = sc.next();
        System.out.println("Write a name for the object: ");
        String name = sc.next();
        System.out.println("Write a description: ");
        String description = sc.next();
        System.out.println("Write the material of what it's made of: ");
        String material = sc.next();
        System.out.println("Give a price for the object: ");
        double price = sc.nextInt();


        objetosSala.add(new objetos(id,price,name,description,material));

        System.out.println("Write the name of the room that you want to add the clues: ");
        String nameSala = sc.next();

        try {
            salasEnigma.stream()
                    .filter(room -> room.getName().equalsIgnoreCase(nameSala))
                    .findFirst()
                    .ifPresent(room -> room.setObjetosSala(objetosSala));
            System.out.println("The object has created correctly.");
        } catch (Exception e){
            System.out.println("There aren't a room with this name. Please create one.");
        }

    }
    public static String totalPrice (){
        double totalPrice = 0;
        for (objetos totalObjetos : objetosSala) {
            totalPrice += totalObjetos.getPrice();
        }

        return "The total price of the inventory is: " + totalPrice;
    }

    public static void inventory(){
        System.out.println("Write the name of the room to check the inventory: ");
        String nameSala = sc.next();

        try {
            salasEnigma.stream()
                    .filter(room -> room.getName().equalsIgnoreCase(nameSala))
                    .findFirst()
                    .ifPresent(room -> room.getObjetosSala().toString());
            System.out.println("Here are the inventory: ");
            totalPrice();
        } catch (Exception e){
            System.out.println("There aren't a room with this name. Please create one.");
        }

    }

    public static void removeInventory(){
        inventory();
        System.out.println("Select the object that you want to remove of the inventory: ");
        String item = sc.next();

        try {
            salasEnigma.stream()
                    .filter(room -> room.getObjetosSala().equals(item)).findFirst().ifPresent(room -> room.getObjetosSala().remove(item));
        }catch (Exception e){
            System.out.println("There aren't an object with this name. Try again.");
        }
    }
}
