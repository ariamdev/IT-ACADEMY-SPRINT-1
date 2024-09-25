package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void exceptionTest() {

       IndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            throw new ArrayIndexOutOfBoundsException("Out of bounds ");
        });

        assertEquals("Out of bounds ", exception.getMessage());

    }

}