package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, introduce the directory path to order: ");
        File directory = new File(sc.next());

        try {
            if (directory.exists() && directory.isDirectory() && directory.canRead()) {
                System.out.println("Valid directory path. ");
                File[] order = directory.listFiles();
                Arrays.sort(order);
                Arrays.stream(order).sorted().forEach(System.out::println);
            } else {
                throw new FileNotFoundException("Error directory not found.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error directory not found. " + e);
        }

        sc.close();
    }
}
