package com.example;

public class XestorBateria {

    private int nivelCarga;

    public XestorBateria(int cargaInicial) {
        nivelCarga = cargaInicial;
    }

    public void cargar(int cantidade) {

        if (cantidade > 0) {
            nivelCarga = nivelCarga + cantidade;
        }

    }

    public void descargar(int cantidade) {

        if (cantidade > 0) {
            nivelCarga = nivelCarga - cantidade;
        }

    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public boolean estaBaleira() {

        return nivelCarga <= 0;

    }

    public boolean necesitaCarga() {

        if (estaBaleira()) {
            return true;
        }

        return nivelCarga < 20;
    }

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