import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircuitoTest {

    @Test
    void deveRetornarImpedanciaFasor(){
        Circuito circuito = new Circuito();
        circuito.setImpedancia(1.0, 0.0);
        assertEquals("1.0, fase: 0.0", circuito.getImpedancia());
    }

    @Test
    void deveRetornarImpedanciaComplexa(){
        Circuito circuito = new Circuito();
        circuito.setImpedancia(1.5, 0.0);

        assertEquals("1.5 + j0.0", circuito.getComplexa());
    }
}
