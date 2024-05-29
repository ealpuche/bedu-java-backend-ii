package com.bedu.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Test de la suma")
    public void testSumar() {
        assertEquals(16, calculadora.sumar(11, 5));
        assertEquals(0, calculadora.sumar(-1, 1));
        assertEquals(calculadora.sumar(1, 2), calculadora.sumar(2, 1));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    @Test
    @DisplayName("Test de la resta")
    public void testRestar() {
        assertEquals(6, calculadora.restar(11, 5));
    }

    @Test
    @DisplayName("Test de la multiplicación")
    public void testMultiplicar() {
        assertEquals(55, calculadora.multiplicar(11, 5));
    }

    @Test
    @DisplayName("Test de la división")
    public void testDividir() {
        assertEquals(2, calculadora.dividir(10, 5));
        assertEquals(0, calculadora.dividir(0, 5));
        assertEquals(0, calculadora.dividir(0, 0));
    }

}
