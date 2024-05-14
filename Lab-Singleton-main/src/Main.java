import entities.*;

public class Main {
    public static void main(String[] args) {

        //circulo
        Circulo circuloUnico = FabricaFigurasGeometricas.criarCirculo(20);
        System.out.print(circuloUnico.toString());

        System.out.println("\n");

        
        Circulo circuloImpossivel = FabricaFigurasGeometricas.criarCirculo(10);
        System.out.print(circuloImpossivel.toString());


        System.out.println("\n");
        System.out.println("========================");


        //triangulo equilatero
        Triangulo trianguloEquilatero1 = FabricaFigurasGeometricas.criarTriangulo(3,3,3);
        System.out.print(trianguloEquilatero1.toString());

        System.out.println("\n");

        Triangulo trianguloEquilatero2 = FabricaFigurasGeometricas.criarTriangulo(5,5,5);
        System.out.print(trianguloEquilatero2.toString());

        System.out.println("\n");
        System.out.println("========================");


        //triangulo isosceles
        Triangulo trianguloIsosceles1 = FabricaFigurasGeometricas.criarTriangulo(3,3,5);
        System.out.print(trianguloIsosceles1.toString());

        System.out.println("\n");

        Triangulo trianguloIsosceles2 = FabricaFigurasGeometricas.criarTriangulo(5,5,10);
        System.out.print(trianguloIsosceles2.toString());

        System.out.println("\n");
        System.out.println("========================");


        //triangulo escaleno
        Triangulo trianguloEscaleno1 = FabricaFigurasGeometricas.criarTriangulo(3,5,7);
        System.out.print(trianguloEscaleno1.toString());

        System.out.println("\n");

        Triangulo trianguloEscaleno2 = FabricaFigurasGeometricas.criarTriangulo(8,5,3);
        System.out.print(trianguloEscaleno2.toString());

        System.out.println("\n");
        System.out.println("========================");

        //quadrado

        Quadrado quadrado1 = FabricaFigurasGeometricas.criarQuadrado(5);
        System.out.print(quadrado1.toString());

        System.out.println("\n");

        Quadrado quadrado2 = FabricaFigurasGeometricas.criarQuadrado(10);
        System.out.print(quadrado2.toString());

        System.out.println("\n");



    }
}
