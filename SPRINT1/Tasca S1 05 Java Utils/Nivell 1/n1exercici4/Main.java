package n1exercici4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        startProgram();
        sc.close();

    }

    public static void startProgram () throws IOException {

        int opt = 0;

        do {
            System.out.println("MENU: \n" +
                    "1. List a directory \n" +
                    "2. Read a .txt file");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Introduce the directory path: ");
                    File directory = new File(sc.next());
                    if (directory.exists() && directory.isDirectory() && directory.canRead()) {
                        System.out.println("Valid directory path. ");
                        String saveFile = "directoryFile.txt";
                        try (FileWriter save = new FileWriter(saveFile)) {
                            directoryList(directory, save);
                        }
                        System.out.println("The file " + saveFile + " has been saved successfully.");
                    } else {
                        throw new FileNotFoundException("Error directory not found.");
                    }
                    break;
                    case 2:
                        System.out.println("Introduce the directory path of the .txt file: ");
                        String filePath = sc.next();
                        readFile(filePath);
                        break;
                    default:
                        System.err.println("Error. Choose a valid option (1 or 2)");
                        break;
                }

        } while (opt != 2);
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

    private static void readFile (String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String read;
            while ((read = br.readLine()) != null) {
                System.out.println(read);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file " + e);
        }
    }
}
