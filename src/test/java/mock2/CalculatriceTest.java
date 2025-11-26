package mock2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatriceTest {

    @Test
    void testCalcSomme_withMock(){
        Iaddition addService = mock(Iaddition.class);
        when(addService.add(10,20)).thenReturn(30);

        Calculatrice calc = new Calculatrice(addService);
        assertEquals(30, calc.calcSomme(10,20));
        verify(addService).add(10,20);
    }

    @Test
    void TestCalcSomme_withoutMock(){
        Iaddition addService = new Additionneur();
        Calculatrice calc = new Calculatrice(addService);
        assertEquals(30, calc.calcSomme(10,20));
    }

}