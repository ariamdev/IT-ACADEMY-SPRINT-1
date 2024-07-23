package n3exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class testArray {

    @Test
    public void equalArray (){
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

        assertThat(a1).contains(a2);
    }
}
