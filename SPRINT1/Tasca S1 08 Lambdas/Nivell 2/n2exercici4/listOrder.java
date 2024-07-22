package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class listOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("Orange", "300", "Coffee", "250", "Coconut", "275", "Peach", "460", "Steak", "500"));

        list.stream().sorted(String::compareTo).forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------------");

        list.stream().filter(order -> order.contains("e") || order.contains("E")).forEach(System.out::println);
        list.stream().filter(order -> !order.contains("e") && !order.contains("E")).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        list.stream().map(order -> order.replaceAll("a", "4")).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        list.stream().filter(order -> order.matches("[0-9]+")).forEach(System.out::println);
    }
}
