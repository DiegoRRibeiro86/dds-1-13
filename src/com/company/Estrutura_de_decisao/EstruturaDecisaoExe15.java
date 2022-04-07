package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisaoExe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor para o primeiro lado de um triângulo: ");
        double primeiroLadoDoTriangulo = scanner.nextDouble();
        System.out.print("Informe um valor para o segundo lado de um triângulo: ");
        double segundoLadoDoTriangulo = scanner.nextDouble();
        System.out.print("Informe um valor para o terceiro lado de um triângulo: ");
        double terceiroLadoDoTriangulo = scanner.nextDouble();


        if (eUmTriangulo(primeiroLadoDoTriangulo, segundoLadoDoTriangulo, terceiroLadoDoTriangulo)) {
            System.out.println("\nÉ um triângulo.");

            if (trianguloequilatero(primeiroLadoDoTriangulo, segundoLadoDoTriangulo, terceiroLadoDoTriangulo)) {
                System.out.println("\nÉ um triângulo Equilátero.");

            } else if (trianguloIsosceles(primeiroLadoDoTriangulo, segundoLadoDoTriangulo, terceiroLadoDoTriangulo)) {
                System.out.println("\nÉ um triângulo Isósceles.");

            } else if (trianguloEscaleno(primeiroLadoDoTriangulo, segundoLadoDoTriangulo, terceiroLadoDoTriangulo)) {
                System.out.println("\nÉ um triângulo Escaleno.");
            }

        } else {
            System.out.println("\nNão é um triângulo.");
        }
        scanner.close();
}

    private static boolean eUmTriangulo(double primeiroLadoDoTriangulo, double segundoLadoDoTriangulo, double terceiroLadoDoTriangulo) {
        return primeiroLadoDoTriangulo + segundoLadoDoTriangulo > terceiroLadoDoTriangulo &&
                primeiroLadoDoTriangulo + terceiroLadoDoTriangulo > segundoLadoDoTriangulo &&
                segundoLadoDoTriangulo + terceiroLadoDoTriangulo > primeiroLadoDoTriangulo;
    }

    private static boolean trianguloequilatero(double primeiroLadoDoTriangulo, double segundoLadoDoTriangulo, double terceiroLadoDoTriangulo) {
        return primeiroLadoDoTriangulo == segundoLadoDoTriangulo &&
                primeiroLadoDoTriangulo == terceiroLadoDoTriangulo &&
                segundoLadoDoTriangulo == terceiroLadoDoTriangulo;
    }

    private static boolean trianguloIsosceles(double primeiroLadoDoTriangulo, double segundoLadoDoTriangulo, double terceiroLadoDoTriangulo) {
        return primeiroLadoDoTriangulo == segundoLadoDoTriangulo ||
                primeiroLadoDoTriangulo == terceiroLadoDoTriangulo ||
                terceiroLadoDoTriangulo == segundoLadoDoTriangulo;
    }

    private static boolean trianguloEscaleno(double primeiroLadoDoTriangulo, double segundoLadoDoTriangulo, double terceiroLadoDoTriangulo) {
        return primeiroLadoDoTriangulo != segundoLadoDoTriangulo ||
                primeiroLadoDoTriangulo != terceiroLadoDoTriangulo ||
                terceiroLadoDoTriangulo != segundoLadoDoTriangulo;
    }



}

