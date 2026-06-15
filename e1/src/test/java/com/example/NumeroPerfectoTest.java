package com.example;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class NumeroPerfectoTest {
    @Test
    public void testNumeroNegativo() {
        NumeroPerfecto np = new NumeroPerfecto();
        Exception exception = assertThrows(Exception.class, () -> {
            np.esPerfecto(-5);
        });
        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }
    @Test
    public void testValorCero() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertFalse(np.esPerfecto(0));
    }
    @Test
    public void testValorUno() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertFalse(np.esPerfecto(1));
    }
    @Test
    public void testNumeroPerfecto() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertTrue(np.esPerfecto(6));
    }
    /* Proba para outro número perfecto maior */
    @Test
    public void testOtroNumeroPerfectoMayor() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertTrue(np.esPerfecto(28));
    }


    @Test
    public void testNumeroNoPerfectoMayorQueUno() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertFalse(np.esPerfecto(10));
    }

    @Test
    public void testIntegerMinValue() {
        NumeroPerfecto np = new NumeroPerfecto();
        Exception exception = assertThrows(Exception.class, () -> {
            np.esPerfecto(Integer.MIN_VALUE);
        });
        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }

    @Test
    public void testIntegerMaxValue() throws Exception {
        NumeroPerfecto np = new NumeroPerfecto();
        assertFalse(np.esPerfecto(Integer.MAX_VALUE));
    }

}