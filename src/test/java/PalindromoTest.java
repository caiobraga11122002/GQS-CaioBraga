
import com.mycompany.projetovalidapalindromo.ValidaPalindromo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromoTest {
    @ParameterizedTest
    @CsvSource({
        "OVO, true",
        "Caio, false",
        "teste, false",
        "ana, true",
    })
    void deveVerificaPalindromoTeste(String palavra, boolean esperado) {
        assertEquals(esperado, ValidaPalindromo.ehPalindromo(palavra));
    }
    }

