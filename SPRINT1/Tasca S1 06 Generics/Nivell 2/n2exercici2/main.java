package n2exercici2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(new Persona ("Ainoa ","Aran ",30));
        list1.add("Barcelona");
        list1.add(2024);

        GenericMethods.metodGeneric(list1);





    }
}
