package com.example;

/*
Se crea la clase XestorBateria
 */
public class XestorBateria {

    /*
Contiene un int nivelCarga
 */
    private int nivelCarga;

    /*
El nivelCarga va a ser igual a cargaInicial
*/
    public XestorBateria(int cargaInicial) {
        nivelCarga = cargaInicial;
    }

    /*
Si la cantidad es mayor a cero se le va a sumar a nivelCarga la cantidad dicha
*/
    public void cargar(int cantidade) {

        if (cantidade > 0) {
            nivelCarga = nivelCarga + cantidade;
        }

    }

    /*
Si la cantidad es mayor a cero se le va a restar a nivelCarga la cantidad dicha
*/
    public void descargar(int cantidade) {

        if (cantidade > 0) {
            nivelCarga = nivelCarga - cantidade;
        }

    }

    /*
Devuelve nivelCarga
*/
    public int getNivelCarga() {
        return nivelCarga;
    }

    /*
Si tiene 0 porciento devuelve nivelCarga
*/
    public boolean estaBaleira() {

        return nivelCarga <= 0;

    }

    /*
Si la funcion estaBaleira es cierta devuelve eso si no avisa cuando está por debajo de 20
*/
    public boolean necesitaCarga() {

        if (estaBaleira()) {
            return true;
        }

        return nivelCarga < 20;
    }

    /*
        Se crea la funcion obterEstado que contien lo siguiente:
        Si nivelCarga es menor que 0 da error
        Si nivelCarga es menor que 50 da Baixa
        Si nivelCarga es menor que 80 da Media
        Si nivelCarga es menor que 100 da Alta

*/
    public String obterEstado() {

        if (nivelCarga < 0) {
            return "Erro";
        }

        if (nivelCarga < 50) {
            return "Baixa";
        }

        if (nivelCarga < 80) {
            return "Media";
        }

        if (nivelCarga <= 100) {
            return "Alta";
        }

        return "Sobrecargada";
    }
}