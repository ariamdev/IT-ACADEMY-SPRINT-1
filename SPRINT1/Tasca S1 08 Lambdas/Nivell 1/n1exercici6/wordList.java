package n1exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class wordList {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList("Hello, how are you?", "Bonjour, comment ça va?", "Hola, qué tal?",
                "Hallo, wie geht's?", "Konnichiwa, ogenki desu ka?"));

        wordList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
