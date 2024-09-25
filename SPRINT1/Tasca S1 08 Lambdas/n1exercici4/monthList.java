package n1exercici4;

import java.util.ArrayList;
import java.util.Arrays;

public class monthList {
    public static void main(String[] args) {
        ArrayList <String> monthList = new ArrayList<>();
        monthList.addAll(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"));

        monthList.forEach(System.out::println);
    }
}
