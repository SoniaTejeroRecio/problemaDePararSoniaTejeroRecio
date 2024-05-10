package test;

import modelo.MaquinaReverser;
import modelo.MaquinaHaltchecker;
import modelo.Maquina;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaReverserTest {
    private MaquinaReverser maquina;

    @Before
    public void setUp() {
        String programa = "Aquí va tu código de programa";
        maquina = new MaquinaReverser(programa);
    }

    @Test
    public void testGestionarConNextGestionarTrue() {
        Maquina next = new MaquinaHaltchecker("programa", "input no numérico");
        maquina = new MaquinaReverser(next, "programa");
        boolean result = maquina.gestionar();
        assertTrue(result);
    }

    @Test
    public void testGestionarConNextGestionarFalse() {
        // Aquí necesitarías una implementación de Maquina donde gestionar devuelva false
        Maquina next = new MaquinaHaltchecker("programa inválido", "123");
        maquina = new MaquinaReverser(next, "programa");
        boolean result = maquina.gestionar();
        assertTrue(result);
    }
    @Test
    public void testGestionarConProgramaNulo() {
        Maquina next = new MaquinaHaltchecker(null, "input no numérico");
        maquina = new MaquinaReverser(next, null);
        boolean result = maquina.gestionar();
        assertTrue(result);
    }

    @Test
    public void testGestionarConProgramaVacio() {
        Maquina next = new MaquinaHaltchecker("", "123");
        maquina = new MaquinaReverser(next, "");
        boolean result = maquina.gestionar();
        assertTrue(result);
    }
    @Test
    public void testGestionarConProgramaLargo() {
        String programaLargo = "Este es un programa muy largo que contiene muchas palabras y caracteres";
        Maquina next = new MaquinaHaltchecker(programaLargo, "input no numérico");
        maquina = new MaquinaReverser(next, programaLargo);
        boolean result = maquina.gestionar();
        assertTrue(result);
    }

    @Test
    public void testGestionarConProgramaConCaracteresEspeciales() {
        String programaConCaracteresEspeciales = "Este programa contiene caracteres especiales como !@#$%^&*()";
        Maquina next = new MaquinaHaltchecker(programaConCaracteresEspeciales, "123");
        maquina = new MaquinaReverser(next, programaConCaracteresEspeciales);
        boolean result = maquina.gestionar();
        assertTrue(result);
    }
}