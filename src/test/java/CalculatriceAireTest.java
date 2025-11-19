import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceAireTest {

    List<IForme> formes = Arrays.asList(new Cercle(2.0),
            new Rectangle(2,4));

    @Test
    void aire() {
        assertEquals(20.56, CalculatriceAire.aire(formes), 0.01);
    }
}