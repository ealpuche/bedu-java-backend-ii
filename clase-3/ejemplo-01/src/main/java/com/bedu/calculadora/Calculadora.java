package com.bedu.calculadora;

public class Calculadora {

    private int resultado;

    public Calculadora() {
        this.resultado = 0;
    }

    public int sumar(int a, int b) {
        this.resultado = a + b;
        return this.resultado;
    }

    public int restar(int a, int b) {
        this.resultado = a - b;
        return this.resultado;
    }

    public int multiplicar(int a, int b) {
        this.resultado = a * b;
        return this.resultado;
    }

    public int dividir(int a, int b) {
        this.resultado = a / b;
        return this.resultado;
    }

    
}
