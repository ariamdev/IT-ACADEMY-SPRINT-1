package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        Month august = new Month("August");

        months.add(7, august);

        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("----------------------------------------------------------------");

        HashSet<Month> monthHashSet = new HashSet<>(months);

        for (Month month : monthHashSet) {
            System.out.println("- " + month.getName());
        }

        Iterator<Month> it = monthHashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
