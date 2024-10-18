package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

        System.out.println("Please, introduce the directory path to order: ");
        File directory = new File(sc.next());

            if (directory.exists() && directory.isDirectory() && directory.canRead()) {
                System.out.println("Valid directory path. ");
                directoryList(directory);
            } else {
                System.out.println("Error directory not found or inaccessible.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error directory not found. " + e);
        }

    }

    public static void directoryList(File directory){

        File [] listDirectory = directory.listFiles();

        if (listDirectory != null) {
            Arrays.sort(listDirectory);
            for (File order : listDirectory) {
                SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String date = formatDate.format(order.lastModified());

                String type = order.isDirectory() ? "D" : "F";
                System.out.println(type + " - " + order.getName() + " Last modified: " + date);

                if (order.isDirectory()) {
                    directoryList(order);
                }
            }
        }else {
            System.out.println("There are no elements in this directory.");
        }
    }
}
