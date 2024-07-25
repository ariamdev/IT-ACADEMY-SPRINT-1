package n1exercici5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        startProgram();

    }

    public static void startProgram () throws IOException, ClassNotFoundException {

        int opt = 0;
        String name = "";

        do {
            System.out.println("MENU: \n" +
                    "1. List a directory \n" +
                    "2. Read a .txt file \n" +
                    "3. Serialise a java object\n" +
                    "4. Read .ser file \n" +
                    "0. Exit");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Introduce the directory path: ");
                    File directory = new File(sc.next());
                    listDirectory(directory);
                    break;
                case 2:
                    System.out.println("Introduce the directory path of the .txt file: ");
                    String filePath = sc.next();
                    readFile(filePath);
                    break;
                case 3:
                    System.out.println("Introduce the User name: ");
                    name = sc.next();
                    User user = new User(name);
                    System.out.println("Introduce the path where you want to save the file .ser: ");
                    String pathSer = sc.next();
                    System.out.println("Introduce the name of the file .ser (including .ser): ");
                    String nameSer = sc.next();
                    String fileSer = pathSer + nameSer;
                    serialize(user, fileSer);
                    break;
                case 4:
                    System.out.println("Introduce the path to the file .ser: ");
                    String ruta = sc.next();
                    File file = new File(ruta);
                    deserialize(file);
                    break;
                case 0:
                    System.out.println("See you soon. ");
                    break;
                default:
                    System.err.println("Error. Choose a valid option (1,2,3,4)");
                    break;
                }

        } while (opt != 0);
        sc.close();
    }

    public static void listDirectory(File directory) throws FileNotFoundException{
        try {
            if (directory.exists() && directory.isDirectory() && directory.canRead()) {
                System.out.println("Valid directory path. ");
                String saveFile = "directoryFile.txt";
                FileWriter save = new FileWriter(saveFile);
                directoryList(directory, save);
                System.out.println("The file " + saveFile + " has been saved successfully.");
                save.close();
            } else {
                throw new FileNotFoundException("Error directory not found.");
            }
        } catch (IOException e) {
            System.err.println("Error directory not save. " + e);
        }
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

    private static void serialize (User user, String archiveName) throws IOException {

        try {
            FileOutputStream fileOutput = new FileOutputStream(archiveName);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(user);
            objectOutput.close();
            fileOutput.close();
            System.out.println("Object serialised correctly in " + archiveName);

        }catch (IOException e){
            System.out.println("Error to serialize the file." + e);

        }
    }

    private static void deserialize (File file) throws IOException, ClassNotFoundException {

        try {
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            User userReader = (User) objectInput.readObject();
            System.out.println(userReader);
            objectInput.close();
            fileInput.close();
        }catch (IOException e){
            System.out.println("Error to deserialize the file." + e);
        }catch (ClassNotFoundException e){
            System.out.println("File not found." + e);

        }
    }
}
