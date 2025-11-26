import mock1.CalculatriceAire;
import mock1.Cercle;
import mock1.IForme;
import mock1.Rectangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceAireTest {

    CalculatriceAire calculatriceAire = new CalculatriceAire();
    List<IForme> formes = Arrays.asList(new Cercle(2.0),
            new Rectangle(2,4));


    @Test
    void aire() {
        assertEquals(20.56, CalculatriceAire.aire(formes), 0.01);
    }

    @Test
    void testAire(){
        CalculatriceAire calc = new CalculatriceAire();
        List<IForme> formes = Arrays.asList(
                new Cercle(2.0),     // Area = 4 * PI ≈ 12.56
                new Rectangle(2, 4)  // Area = 8
        );
        // 12.56 + 8 = 20.56
        assertEquals(20.56, calc.aire(formes), 0.01);
    }

    @Test
    public void testAireAvecMockCarre() {
        IForme carre = Mockito.mock((IForme.class));
        when(carre.aire()).thenReturn(4.0);
        List<IForme> formes = Arrays.asList(new Cercle(2.0), new Rectangle(2,4), carre);
        assertEquals(24.56, calculatriceAire.aire(formes), 0.01);
        verify(carre, Mockito.times(1)).aire();
    }
}