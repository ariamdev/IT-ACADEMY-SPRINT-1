package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Game {

    public static HashMap<String, String> mapCountries() {

        HashMap<String, String> contriesCapitals = new HashMap<String, String>();

        try (FileReader countries = new FileReader("C:/Users/ainoa/Desktop/Programacion/Java/countries.txt")) {
            BufferedReader br = new BufferedReader(countries);
            String line;
            while ((line = br.readLine()) != null) {
                String[] items = line.split(" ", 2);
                if (!line.isEmpty()) { //La lista esta vacia así que salta aquí
                    String key = items[0].replace("_", " "); // le da una key y elimina la _
                    String value = items[1].replace("_", " "); // le da un value y elimina la _
                    contriesCapitals.put(key, value); //añade los dos valores al hashmap
                }
            }
        } catch (IOException e) {
            System.out.println("File not found." + e.getMessage());
        }

        return contriesCapitals;
    }

    public static String randomCountries(HashMap<String, String> countriesCapitals) {
        Set<String> countries = countriesCapitals.keySet();
        int randomIndex = (int) (Math.random() * countries.size());
        String[] countriesArray = countries.toArray(new String[countries.size()]);
        return countriesArray[randomIndex];
    }

    public static void gameCountries() throws IOException {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> countriesCapitals = mapCountries();

        String name;
        String randomCountrie;
        String correctCapital;
        int score = 0;

        System.out.println("Welcome to 'Guess the capital' game. \n" +
                "Please enter your game nickname: ");
        name = sc.next();

        System.out.println("Rules: \n" +
                "You have 10 tries to guess the capitals of the countries. \n" +
                "For each correct capital you will get 1 point. \n" +
                "Let's start!");

        for (int i = 0; i < 10; i++) {

            randomCountrie = randomCountries(countriesCapitals);
            correctCapital = countriesCapitals.get(randomCountrie);

            System.out.println("Introduce the capital name of: " + randomCountrie);
            String capital = sc.next();

            if (capital.trim().equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct! You get 1 point.");
                score++;
            } else {
                System.out.println("Incorrect. Keep trying!");
            }
        }

        System.out.println("Game over. \n" +
                "Final score: " + score);

        saveScore(name, score);
        System.out.println("Your score has been saved to classificacio.txt");
    }

    public static void saveScore(String name, int score) throws IOException {
        FileWriter writer = new FileWriter("classificacio.txt", true);
        writer.write("Player " + name + "Score: " + score + "\n");
        writer.close();
    }

}