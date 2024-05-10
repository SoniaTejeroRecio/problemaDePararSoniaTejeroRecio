package test;

import modelo.MaquinaHaltchecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MaquinaHaltcheckerTest {
    private MaquinaHaltchecker maquina;

    @Before
    public void setUp() {
        String programa = "Aquí va tu código de programa";
        String input = "Aquí va tu input";
        maquina = new MaquinaHaltchecker(programa, input);
    }

    @Test
    public void testGestionar() {
        boolean result = maquina.gestionar();
        assertTrue(result);  // Si esperas que el resultado sea verdadero
        // o
        assertFalse(result);  // Si esperas que el resultado sea falso
    }
    @Test
    public void testGestionarConInputNoNumerico() {
        maquina = new MaquinaHaltchecker("programa", "input no numérico");
        boolean result = maquina.gestionar();
        assertTrue(result);
    }

    @Test
    public void testGestionarConInputNumerico() {
        maquina = new MaquinaHaltchecker("programa", "123");
        boolean result = maquina.gestionar();
        // Aquí necesitarás verificar el resultado esperado basándote en tu implementación de AnalizadorLexico.analizar
        assertTrue(result);  // Si esperas que el resultado sea verdadero
        // o
        assertFalse(result);  // Si esperas que el resultado sea falso
    }
    @Test
    public void testGestionarConInputNegativo() {
        maquina = new MaquinaHaltchecker("programa", "-123");
        boolean result = maquina.gestionar();
        assertTrue(result);  // Si esperas que el resultado sea verdadero
        // o
        assertFalse(result);  // Si esperas que el resultado sea falso
    }

    @Test
    public void testGestionarConInputPositivoYProgramaInvalido() {
        maquina = new MaquinaHaltchecker("programa inválido", "123");
        boolean result = maquina.gestionar();
        // Aquí necesitarás verificar el resultado esperado basándote en tu implementación de AnalizadorLexico.analizar
        assertTrue(result);  // Si esperas que el resultado sea verdadero
        // o
        assertFalse(result);  // Si esperas que el resultado sea falso
    }
}