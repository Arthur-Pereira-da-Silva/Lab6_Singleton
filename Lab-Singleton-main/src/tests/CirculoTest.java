package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import entities.Circulo;

public class CirculoTest {

    private Circulo circulo;

    @Before
    public void setUp() {
        circulo = Circulo.getInstanciaUnicaCirculo(10);
    }

    @Test
    public void testGetRaio() {
        assertEquals(10, circulo.getRaio(), 0); 
    }

    @Test
    public void testSetRaio() {
        circulo.setRaio(10); 
        assertEquals(10, circulo.getRaio(), 0); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRaioInvalido() {
        circulo.setRaio(-5); 
    }

    @Test
    public void testArea() {
        assertEquals(314.0, circulo.area(), 0.1); 
    }

    @Test
    public void testPerimetro() {
        assertEquals(62.800000000000004, circulo.perimetro(), 0.1); 
    }


}
