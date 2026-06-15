package com.example;

public class NumeroPerfecto {

    public boolean esPerfecto(int n) throws Exception {

        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        if (n == 0 || n == 1) {
            return false;
        }

        int suma = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                suma += i;
            }

        }

        return suma == n;
    }
}
