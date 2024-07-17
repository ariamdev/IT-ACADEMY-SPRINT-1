package n2exercici2;

import java.util.ArrayList;

public class GenericMethods {

    public static <U> void metodGeneric (ArrayList<U> list) {
        for(U lists: list) {
            System.out.println(lists);
        }
    }
}
