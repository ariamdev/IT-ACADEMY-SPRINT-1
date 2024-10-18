package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please, introduce the directory path to order: ");
            File directory = new File(sc.next());

            if (directory.exists() && directory.isDirectory() && directory.canRead()) {
                sortAndPrintFiles(directory);
            } else {
                verifyDirectory(directory);
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    private static void sortAndPrintFiles(File directory) {
        File[] files = directory.listFiles();

        if (files == null) {
            System.err.println("Error: Directory not found or not accessible.");
        } else if (files.length == 0) {
            System.out.println("Directory is empty.");
        } else {
            Arrays.stream(files).sorted().forEach(file -> System.out.println(file.getName()));
        }
    }

    private static void verifyDirectory(File directory) {
        if (!directory.exists()) {
            System.err.println("Error: Directory does not exist!");
        } else if (!directory.isDirectory()) {
            System.err.println("Error: Provided path is not a directory!");
        } else if (!directory.canRead()) {
            System.err.println("Error: Directory is not readable!");
        }
    }
}
