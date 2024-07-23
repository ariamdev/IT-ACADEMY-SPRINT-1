package n3exercici4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;


class testArrayList {

    @Test
    public void orderList (){
        ArrayList<Object> bookList = new ArrayList<>();
        bookList.add("Elantris");
        //bookList.add("Brandon Sanderson");
        bookList.add(2006);
        bookList.add(12.30);


        assertThat(bookList).containsExactly("Elantris",2006,12.30);

        assertThat(bookList).containsExactlyInAnyOrder(2006,"Elantris",12.30);

        assertThat(bookList).containsOnlyOnce("Elantris",2006,12.30);

        assertThat(bookList).doesNotContain("Brandon Sanderson");
    }

}