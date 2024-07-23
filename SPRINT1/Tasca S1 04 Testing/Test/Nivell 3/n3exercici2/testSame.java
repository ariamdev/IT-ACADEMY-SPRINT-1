package n3exercici2;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class testSame {

    @Test
    public void areTheSame (){
        String name = "Frodo Beggins";
        String theSame = name;

        assertThat(name).isSameAs(theSame);
    }

    @Test
    public void notTheSame(){
        String name = "Frodo Beggins";
        String name2 = "Legolas Greenleaf";

        assertThat(name).isNotSameAs(name2);
    }
}
