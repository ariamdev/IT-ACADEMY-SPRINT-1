package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class calculDniTest {

    @ParameterizedTest //Test parametrizado (es decir que se repita varias veces con diferentes variables)
    //ValueSource: los valores que queremos que utilice y las veces (10 valores -> 10 veces).
    @CsvSource(value = {"39931706-A","34835767-J","48743957-B","33957834-J","77364986-R","23047848-P",
            "47102244-S","39718459-N","38945678-P","47826473-C"}, delimiter = '-')
     void calculateTest(int id, char letter){ //pasamos las variables de referencia
        calculDni dni = new calculDni(id);
        assertEquals(letter, dni.calculateLetter());




    }

}