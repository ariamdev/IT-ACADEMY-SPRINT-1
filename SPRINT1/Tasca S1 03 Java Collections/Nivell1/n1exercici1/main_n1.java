package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main_n1 {
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

        System.out.println("Arraylist: ");
        int order = 1;
        for (Month month : months) {
            System.out.println(order + ". " + month);
            order++;
        }

        System.out.println("----------------------------------------------------------------");

        HashSet<Month> monthHashSet = new HashSet<>(months);
        monthHashSet.add(august);
        System.out.println("No duplicated months: " + monthHashSet);
        System.out.println("Same size: " + monthHashSet.size());


        System.out.println("----------------------------------------------------------------");

        //For:
        System.out.println("Hashset don't follow any order: ");
        order = 1;
        for (Month monthSet : monthHashSet) {
            System.out.println(order + ". " + monthSet.getName());
            order++;
        }

        System.out.println("----------------------------------------------------------------");


        //Iterator:
        Iterator<Month> iteratorList = monthHashSet.iterator();
        System.out.println("Iterator: ");
        order = 1;
        while (iteratorList.hasNext()) {
            System.out.println(order + ". " + iteratorList.next().getName());
            order++;
        }
    }
}
