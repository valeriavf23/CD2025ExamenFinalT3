package com.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private double limiteDescubierto;

    public CuentaBancaria(String titular, double saldo, double limiteDescubierto) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public void ingresar(double cantidad) throws Exception {

        if (cantidad <= 0) {
            throw new Exception("Cantidad inválida");
        }

        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {

        if (cantidad <= 0) {
            throw new Exception("Cantidad inválida");
        }

        if (cantidad > saldo + limiteDescubierto) {
            throw new Exception("Saldo insuficiente");
        }

        saldo = saldo - cantidad;
    }

    public double calcularSaldoDisponible() {
        return saldo + limiteDescubierto;
    }
}