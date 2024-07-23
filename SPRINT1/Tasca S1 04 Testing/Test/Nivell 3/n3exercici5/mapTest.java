package n3exercici5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class mapTest {

    @Test
    public void mapKeyTest(){
        Map<String,String> bookList = new HashMap<>();
        bookList.put("Elantris","Brandon Sanderson");
        bookList.put("The Name of the Wind","Patrick Rothfuss");
        bookList.put("The wheel of time","Robert Jordan");

        assertThat(bookList).containsKey("Elantris");

        //assertThat(bookList).containsKeys("Elantris","The Name of the Wind","The wheel of time");
    }
}
