package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import entities.Triangulo;
import interfaces.TipoTriangulo;

public class TrianguloTest {

    @Test
    public void testGetLado1() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(6, 4, 5);
        assertEquals(6, triangulo.getLado1(), 0);
    }

    @Test
    public void testGetLado2() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        assertEquals(4, triangulo.getLado2(), 0);
    }

    @Test
    public void testGetLado3() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        assertEquals(5, triangulo.getLado3(), 0);
    }

    @Test
    public void testSetLado1() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        triangulo.setLado1(6);
        assertEquals(6, triangulo.getLado1(), 0);
    }

    @Test
    public void testSetLado2() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        triangulo.setLado2(7);
        assertEquals(7, triangulo.getLado2(), 0);
    }

    @Test
    public void testSetLado3() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        triangulo.setLado3(8);
        assertEquals(8, triangulo.getLado3(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLadoInvalido() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(3, 4, 5);
        triangulo.setLado1(-3);
    }

    @Test
    public void testGetTipoDoTriangulo() {
        Triangulo trianguloEquilatero = Triangulo.getInstanciaTriangulo(5, 5, 5);
        Triangulo trianguloIsosceles = Triangulo.getInstanciaTriangulo(5, 5, 6);
        Triangulo trianguloEscaleno = Triangulo.getInstanciaTriangulo(3, 4, 5);

        assertEquals(TipoTriangulo.EQUILATERO, trianguloEquilatero.getTipo());
        assertEquals(TipoTriangulo.ISOSCELES, trianguloIsosceles.getTipo());
        assertEquals(TipoTriangulo.ESCALENO, trianguloEscaleno.getTipo());
    }

    @Test
    public void testArea() {
        Triangulo triangulo = Triangulo.getInstanciaTriangulo(6, 4, 5);
        assertEquals(9.921567416492215, triangulo.area(), 0);
    }

    
}

