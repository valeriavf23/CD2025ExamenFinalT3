package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    void testCreacionCuentaBancaria() {
        CuentaBancaria p = new CuentaBancaria("Valeria",300.00,500.00);
}
    @Test
    void ingresar() throws Exception {
        CuentaBancaria p = new CuentaBancaria("Valeria",300.00,500.00);

        Exception exception = assertThrows(Exception.class, () -> {
            p.ingresar(-10);
        });

        assertEquals("Cantidad inválida", exception.getMessage());

}
    @Test
    void retirar() throws Exception {
        CuentaBancaria p = new CuentaBancaria("Valeria",300.00,500.00);

        Exception exception = assertThrows(Exception.class, () -> {
            p.ingresar(-10);
        });

        assertEquals("Cantidad inválida", exception.getMessage());

    }

}