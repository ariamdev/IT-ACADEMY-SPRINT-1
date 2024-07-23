package n3exercici1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class testEquals {

    @Test
    public void equalIntegers (){
        int num1 = 5;
        int num2 = 5;

        assertThat(num1).isEqualTo(num2);
    }

    @Test
    public void notEqualInt (){
        int num1 = 8;
        int num2 = 5;

        assertThat(num1).isNotEqualTo(num2);
    }
}
