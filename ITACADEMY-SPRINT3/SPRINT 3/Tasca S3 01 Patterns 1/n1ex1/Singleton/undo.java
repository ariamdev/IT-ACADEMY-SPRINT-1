package n1ex1.Singleton;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class undo {
    static Scanner sc = new Scanner(System.in);

    private static undo instance;
    private ArrayList<order> history= new ArrayList<>();


    private undo() {
    }

    public static undo getInstance(){
        if(instance == null){
            instance = new undo();
        }
        return instance;
    }

    public void menu(){

        int opt;
        do{
            System.out.println("MENÚ: \n" +
                    "1.Add order.\n" +
                    "2.Delete order.\n" +
                    "3.Order history.\n" +
                    "0.Log out.");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    newOrder();
                    break;
                case 2:
                    deletOrder();
                    break;
                case 3:
                    listHistory();
                    break;
            }
        }while(opt!=0); {
            System.out.println("Bye bye.");
        }

    }

    public void newOrder(){
        System.out.println("Write the ID: ");
        int ID = readInt();
        sc.nextLine();
        System.out.println("Write the name: ");
        String name = sc.nextLine();
        System.out.println("Write the adress: ");
        String adress = sc.nextLine();
        System.out.println("The order has added to the history.");
        history.add(new order(name,ID,adress));
    }

    public void deletOrder(){
        if (!history.isEmpty()) {
            System.out.println("What order do you want to delete?\n" +
                    "Write the ID of the order:");
            int ID = readInt();
            order deOrder = history.stream().
                    filter(delet -> delet.getID() == ID).findFirst().orElse(null);
            if(deOrder != null){
                history.remove(deOrder);
                System.out.println("The " + deOrder + " has been deleted.");
            } else {
                System.out.println("There isn't an order with this ID, try again.");
            }
        } else {
            System.out.println("There aren't any order created. Please create one.");
        }
    }

    public void listHistory(){
        history.forEach(list -> System.out.println(list.toString()));
    }

    public static int readInt(){

        int valorInt = 0;
        boolean valid = false;

        do {
            try {
                valorInt = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("Please introduce a valid number for the ID.");
                sc.nextLine();
            }
        } while (!valid);
        return valorInt;
    }

}
