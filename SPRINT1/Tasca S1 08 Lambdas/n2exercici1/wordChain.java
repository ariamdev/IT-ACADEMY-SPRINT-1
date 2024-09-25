package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class wordChain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Ainoa","Eric","Ana","Patricia","David","Sheila"));

        nameList.stream().filter(letterA -> letterA.startsWith("A")
                && letterA.length() == 3).toList().forEach(System.out::println);
    }
}
