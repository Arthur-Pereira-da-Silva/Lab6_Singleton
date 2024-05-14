package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import entities.Quadrado;

public class QuadradoTest {

    @Test
    public void testGetLado() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(5, quadrado.getLado(), 0);
    }

    @Test
    public void testSetLado() {
        Quadrado quadrado = new Quadrado(5);
        quadrado.setLado(10);
        assertEquals(10, quadrado.getLado(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLadoInvalido() {
        Quadrado quadrado = new Quadrado(5);
        quadrado.setLado(-5);
    }

    @Test
    public void testArea() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(25, quadrado.area(), 0);
    }

    @Test
    public void testPerimetro() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(20, quadrado.perimetro(), 0);
    }


}
