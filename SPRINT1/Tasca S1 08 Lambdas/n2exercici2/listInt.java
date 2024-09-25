package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class listInt {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        String listOrder =  intList.stream().map(a -> (a % 2 == 0 ? "e":"o") + a).collect(Collectors.joining(","));
        System.out.println(listOrder);


    }
}
