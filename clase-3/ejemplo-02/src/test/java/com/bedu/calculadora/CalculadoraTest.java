package com.bedu.calculadora;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculadoraTest {

    @Test
    public void testCalculadora(){
        Calculadora mockCalculadora = mock(Calculadora.class);
        when(mockCalculadora.sumar(1, 2)).thenReturn(3);
        when(mockCalculadora.sumar(1, 3)).thenReturn(4);
        when(mockCalculadora.restar(5, 3)).thenReturn(2);
        when(mockCalculadora.multiplicar(2, 3)).thenReturn(6);
        when(mockCalculadora.dividir(10, 2)).thenReturn(5);

        assertEquals(3, mockCalculadora.sumar(1, 2));
        assertEquals(4, mockCalculadora.sumar(1, 3));
        assertNotEquals(5, mockCalculadora.sumar(1, 2));
        assertNotEquals(6, mockCalculadora.sumar(1, 2));
    }
    
}
