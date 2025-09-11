package aulas.aula2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void testMulherAbaixoDoPeso() {
        pessoa.setPeso(45.0f);
        pessoa.setAltura(1.70f);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso", pessoa.verificarImc());
    }

    @Test
    public void testMulherPesoNormal() {
        pessoa.setPeso(60.0f);
        pessoa.setAltura(1.65f);
        pessoa.setSexo("Masculino");
        assertEquals("No peso normal", pessoa.verificarImc());
    }

    @Test
    public void testHomemAcimaDoPeso() {
        pessoa.setPeso(90.0f);
        pessoa.setAltura(1.75f);
        pessoa.setSexo("Masculino");
        assertEquals("Acima do peso ideal", pessoa.verificarImc());
    }

    @Test
    public void testHomemObeso() {
        pessoa.setPeso(110.0f);
        pessoa.setAltura(1.70f);
        pessoa.setSexo("Masculino");
        assertEquals("Obeso", pessoa.verificarImc());
    }

    @Test
    public void testSexoInvalido() {
        try {
            pessoa.setSexo("outro");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Sexo Inválido", e.getMessage());
        }
    }
}
