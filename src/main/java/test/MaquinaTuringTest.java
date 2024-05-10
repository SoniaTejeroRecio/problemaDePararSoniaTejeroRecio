package test;

import modelo.Maquina;
import modelo.MaquinaTuring;
import modelo.MaquinaHaltchecker;
import modelo.MaquinaReverser;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaTuringTest {
    private MaquinaTuring maquina;
    private Maquina next;
    private Maquina anotherNext;

    @Before
    public void setUp() {
        maquina = new MaquinaHaltchecker("programa", "input");
        next = new MaquinaReverser("programa");
        anotherNext = new MaquinaHaltchecker("otro programa", "otro input");
    }

    @Test
    public void testSetNextWithMaquinaInstance() {
        maquina.setNext(next);
        assertEquals(next, maquina.getNext());
    }

    @Test
    public void testSetNextWithNull() {
        maquina.setNext(null);
        assertNull(maquina.getNext());
    }

    @Test
    public void testConstructorWithMaquinaInstance() {
        MaquinaTuring maquinaWithNext = new MaquinaHaltchecker(next, "programa", "input");
        assertEquals(next, maquinaWithNext.getNext());
    }

    @Test
    public void testGestionar() {
        boolean result = maquina.gestionar();
        // Asegúrate de reemplazar esto con la condición de prueba correcta
        assertTrue(result);
    }

    @Test
    public void testSetNextMultipleTimes() {
        maquina.setNext(next);
        maquina.setNext(anotherNext);
        assertEquals(anotherNext, maquina.getNext());
    }
}