package Testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


class JunitTeste2 {


	    @Test
	    public void testMedia() {
	        CalculadoraEstatistica calculator = new CalculadoraEstatistica();
	        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
	        assertEquals(3.0, calculator.Media(numbers));
	    }

	    @Test
	    public void testModa() {
	        CalculadoraEstatistica calculator = new CalculadoraEstatistica();
	        List<Double> numbers = Arrays.asList(1.0, 2.0, 2.0, 3.0, 3.0, 3.0);
	        assertEquals(3.0, calculator.Moda(numbers));
	    }

	    @Test
	    public void testMediana() {
	        CalculadoraEstatistica calculator = new CalculadoraEstatistica();
	        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
	        assertEquals(3.0, calculator.Mediana(numbers));
	    }

	    @Test
	    public void testVariancia() {
	        CalculadoraEstatistica calculator = new CalculadoraEstatistica();
	        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
	        assertEquals(2.5, calculator.Variancia(numbers));
	    }

	    @Test
	    public void testDesvioPadrao() {
	        CalculadoraEstatistica calculator = new CalculadoraEstatistica();
	        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
	        assertEquals(Math.sqrt(2.5), calculator.DesvioPadrao(numbers));
	    }


}
