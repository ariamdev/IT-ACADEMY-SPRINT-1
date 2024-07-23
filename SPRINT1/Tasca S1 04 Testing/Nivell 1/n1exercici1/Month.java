package n1exercici1;

import java.util.ArrayList;

public class Month {

private ArrayList<String> months;

public Month(){

    months = new ArrayList<>();

    months.add("January");
    months.add("February");
    months.add("March");
    months.add("April");
    months.add("May");
    months.add("June");
    months.add("July");
    months.add("August");
    months.add("September");
    months.add("October");
    months.add("November");

}
    public ArrayList<String> getMonths() {
        return months;
    }
}
