package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class wordsWithO {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList("Orange","Coffee","Coconut","Peach","Steak"));

        wordList.stream().filter(letterO -> letterO.contains("o") ||
                letterO.contains("O")).toList().forEach(System.out::println);

    }
}
