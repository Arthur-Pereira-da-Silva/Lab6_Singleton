package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import entities.*;

public class FabricaFigurasGeometricasTest {

    @Test
    public void testCriarCirculo() {
        Circulo circulo = FabricaFigurasGeometricas.criarCirculo(10);
        assertNotNull(circulo);
        assertEquals(10, circulo.getRaio(), 0);
    }

    @Test
    public void testCriarQuadrado() {
        Quadrado quadrado = FabricaFigurasGeometricas.criarQuadrado(4);
        assertNotNull(quadrado);
        assertEquals(4, quadrado.getLado(), 0);
    }

    @Test
    public void testCriarCirculoComRaioInvalido() {
        Circulo circulo = FabricaFigurasGeometricas.criarCirculo(-5);
        assertNull(circulo);
    }

    @Test
    public void testCriarQuadradoComLadoInvalido() {
        Quadrado quadrado = FabricaFigurasGeometricas.criarQuadrado(0);
        assertNull(quadrado);
    }

}
