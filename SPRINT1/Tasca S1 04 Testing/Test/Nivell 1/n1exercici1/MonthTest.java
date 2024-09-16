package Test.n1exercici1;

import n1exercici1.Month;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {

    @BeforeEach
    void setup() {
        months = new Month();
        list = months.getMonths();
    }

    @Test
    public void positionsTest(){
        assertEquals(12,list.size());
    }

    @Test
    public void listNull(){
        assertNull(list);
    }

    @Test
    public void listPosition(){
        assertEquals(list.get(8),"August");
    }

}