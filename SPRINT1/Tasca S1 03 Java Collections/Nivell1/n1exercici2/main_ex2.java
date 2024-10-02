package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class main_ex2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<Integer>();

        ListIterator<Integer> listIterator = list1.listIterator();

        while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            list2.add(listIterator.previous());
        }

        System.out.println("Ascendening order: " + list1 +
                "\nDescending order: " + list2);
    }
}
