package examen1;

import java.util.ArrayList;
import java.util.Scanner;

public class game {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Item> items = new ArrayList<>();
    static NPC npc1;

    public static void startGame() {
        int opt;

        do {
            System.out.println("MENÚ: \n" +
                    "1 - Create a new NPC.\n" +
                    "2 - Add items to NPC. \n" +
                    "3 - See the items of the NPC.\n" +
                    "4 - Realizar la venta de un ítem. \n" +
                    "0 - Salir.");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    npc1 = createNPC();
                    break;
                case 2:
                    addItems(npc1);
                    break;
                case 3:
                    checkInventory(npc1);
                    break;
                case 4: sellItems();
                    break;
            }

        } while (opt != 0);

        System.out.println("¡See you soon adventurer!");
    }

    public static NPC createNPC() {
        System.out.println("Write a name for the NPC: ");
        String name = sc.next();
        System.out.println("Write the city where it lives: ");
        String city = sc.next();
        NPC npc = new NPC(name, city);
        System.out.println("Choose the category of the NPC: \n" +
                "1. Farmer.\n" +
                "2. Thief\n" +
                "3. Trader");
        int opt1 = sc.nextInt();
        try{
            switch (opt1) {
            case 1:
                npc.setCategory(category.FARMER);
                break;
            case 2:
                npc.setCategory(category.THIEF);
                break;
            case 3:
                npc.setCategory(category.TRADER);
                break;
            default:
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.err.println("Choose one of the three lvl's! ");
        }
        System.out.println("Congratulations! You have created the NPC " + name + " successfully!");
        return npc;
    }

    public static void addItems(NPC npc) {
        if (npc == null) {
            System.out.println("You need to create an NPC first.");
            return;
        }

        String answer;
        do {
            if (npc.getCategory() == category.FARMER) {
                itemsFarmer(npc);
            } else if (npc.getCategory() == category.THIEF) {
                itemsThief(npc);
            } else if (npc.getCategory() == category.TRADER) {
                itemsTrader(npc);
            }
            System.out.println("Do you want to add another item? (Yes/No)");
            answer = sc.next();
        } while (answer.equalsIgnoreCase("Yes"));
    }

    public static void itemsFarmer(NPC npc) {
        if (items.size() >= 5) {
            System.out.println("A Farmer can only have 5 items max! You can't add more items.");
            return;
        }

        System.out.println("It's a Farmer. It can have only 5 Items.\n" +
                "Give me the name of the item: ");
        String nameItem = sc.next();
        System.out.println("Tell me the type of the item: ");
        String type = sc.next();
        System.out.println("Tell me the price: ");
        double price = sc.nextDouble();
        double percent = (price * 2) /100;
        double totalPrice = price + percent;
        double wearTear = (price * 25) / 100;
        totalPrice = price - wearTear;

        items.add(new Item(nameItem, type, totalPrice));
    }

    public static void itemsThief(NPC npc) {
        if (items.size() >= 3) {
            System.out.println("A Thief can only have 3 items max! You can't add more items.");
            return;
        }


        System.out.println("It's a Thief. It can have only 3 Items.\n" +
                "Give me the name of the item: ");
        String nameItem = sc.next();
        System.out.println("Tell me the type of the item: ");
        String type = sc.next();
        System.out.println("Tell me the price: ");
        double price = sc.nextDouble();
        double wearTear = (price * 25) / 100;
        double totalPrice = price - wearTear;

        items.add(new Item(nameItem, type, totalPrice));
    }

    public static void itemsTrader(NPC npc) {
        if (items.size() >= 7) {
            System.out.println("A Trader can only have 7 items max! You can't add more items.");
            return;
        }

        double wearTear = 0;
        System.out.println("It's a Trader. It can have only 7 Items.\n" +
                "Give me the name of the item: ");
        String nameItem = sc.next();
        System.out.println("Tell me the type of the item: ");
        String type = sc.next();
        System.out.println("Tell me the price: ");
        double price = sc.nextDouble();
        double percent = (price * 4) /100;
        double totalPrice = price + percent;



        items.add(new Item(nameItem, type, totalPrice));
    }

    public static void checkInventory (NPC npc){
        if (npc == null) {
            System.out.println("You need to create an NPC first.");
        }

        System.out.println("These are the items of " + npc.getName());
        items.stream().forEach(System.out::println);

    }

    public static void sellItems(){
        System.out.println("What item dou you want to sell? ");
        String nameItem = sc.next();

        Item itemEncontrado = items.stream()
                .filter(item -> item.getNameItem().equals(nameItem))
                .findFirst()
                .orElse(null);

        if (itemEncontrado != null) {
            items.remove(itemEncontrado);
            System.out.println("You have sold: " + itemEncontrado);
        } else {
            System.out.println("You don't have that Item in the Inventory!");
        }

    }

}
