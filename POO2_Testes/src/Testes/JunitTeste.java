package Testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JunitTeste {


	class ColumnScriptGeneratorTest {
	    @Test
	    void testGenerateScript() {
	    	GeradorScriptColunaSQL generator = new GeradorScriptColunaSQL();
	        
	        // Teste para uma coluna do tipo INT, não nula e com auto incremento
	        assertEquals("`codigo` INT NOT NULL AUTO_INCREMENT,", 
	                     generator.gerarScript("codigo", "INT", true, true));

	        // Teste para uma coluna do tipo INT com auto incremento, mas que pode ser nula
	        assertEquals("`codigo` INT AUTO_INCREMENT,", 
	                     generator.gerarScript("codigo", "INT", false, true));

	        // Teste para uma coluna do tipo INT que não pode ser nula, mas sem auto incremento
	        assertEquals("`codigo` INT NOT NULL,", 
	                     generator.gerarScript("codigo", "INT", true, false));

	        // Teste para uma coluna do tipo INT que pode ser nula e sem auto incremento
	        assertEquals("`codigo` INT,", 
	                     generator.gerarScript("codigo", "INT", false, false));
	    }
	}


}
