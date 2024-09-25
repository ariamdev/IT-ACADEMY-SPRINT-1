package n1exercici1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {

    @Test
    public void positionsTest(){
        Month months = new Month();
        ArrayList<String> list = months.getMonths();
        assertEquals(12,list.size());
    }

    @Test
    public void listNull(){
        Month months = new Month();
        ArrayList<String> list = months.getMonths();
        assertNull(list);
    }

    @Test
    public void listPosition(){
        Month months = new Month();
        ArrayList<String> list = months.getMonths();
        assertEquals(list.get(8),"August");
    }

}