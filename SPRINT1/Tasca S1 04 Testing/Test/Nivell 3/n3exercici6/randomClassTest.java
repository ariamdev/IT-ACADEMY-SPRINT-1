package n3exercici6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class randomClassTest {

    @Test
    public void testOutofBounds(){
        randomClass test1 = new randomClass();

        assertThatThrownBy(() -> test1.arrayOut()).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }

}