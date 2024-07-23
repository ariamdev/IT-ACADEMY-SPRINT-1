package n3exercici7;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import static org.assertj.core.api.Assertions.*;

public class testOptional {

    @Test
    public void optionalEmpty() {

        Optional<String> opt1 = Optional.empty();

        assertThat(opt1).isEmpty();


    }
}
