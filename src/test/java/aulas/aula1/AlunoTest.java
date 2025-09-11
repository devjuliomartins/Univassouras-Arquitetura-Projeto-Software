package aulas.aula1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;
    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void deveReprovarAlunoPorInfrequencia() {
        aluno.setFrequencia(74.9f);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoPorMedia() {
        aluno.setFrequencia(75.0f);
        aluno.setP1(29);
        aluno.setP2(30);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoPorFrequencia() {
        aluno.setFrequencia(75.0f);
        aluno.setP1(70);
        aluno.setP2(70);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoNaProvaFinal() {
        aluno.setFrequencia(75.0f);
        aluno.setP1(30);
        aluno.setP2(30);
        aluno.setProvaFinal(70);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoNaProvaFinal() {
        aluno.setFrequencia(75.0f);
        aluno.setP1(30);
        aluno.setP2(30);
        aluno.setProvaFinal(69);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveLancarExcecaoFrequenciaInvalida() {
        try {
            aluno.setFrequencia(-1.0f);
            aluno.verificarAprovacao();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Frequencia invalida", e.getMessage());
        }
    }

}