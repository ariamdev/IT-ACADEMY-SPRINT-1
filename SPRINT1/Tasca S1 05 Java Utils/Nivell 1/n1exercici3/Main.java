package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
                String saveFile = "directoryFile.txt";
                FileWriter save = new FileWriter(saveFile);
                directoryList(directory,save);
                System.out.println("The file " +  saveFile + " has been saved successfully.");
                save.close();
            } else {
                throw new FileNotFoundException("Error directory not found.");
            }
        } catch (IOException e) {
            System.err.println("Error directory not save. " + e);
        }

        sc.close();
    }

    public static void directoryList(File directory, FileWriter save) throws IOException{

        File [] listDirectory = directory.listFiles();

        if (listDirectory != null) {
            Arrays.sort(listDirectory);
            for (File order : listDirectory) {
                SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String date = formatDate.format(order.lastModified());

                String type = order.isDirectory() ? "D" : "F";
                save.write(type + " - " + order.getName() + " Last modified: " + date + "\n");

                if (order.isDirectory()) {
                    directoryList(order,save);
                }
            }
        }
    }
}
