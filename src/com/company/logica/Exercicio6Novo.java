package com.company.logica;

import java.util.Scanner;

public class Exercicio6Novo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o raio do círculo: ");
        Double raio = scanner.nextDouble();
        Double raioVezesRaio = raioVezesRaio(raio);
        Double area = obterArea(raioVezesRaio);
        System.out.println("A área do círculo corresponde a: " + area + ".");
        scanner.close();
    }

    private static Double obterArea(Double raioVezesRaio) {
        Double pi = 3.14;
        return pi * raioVezesRaio;
    }

    private static double raioVezesRaio(Double raio) {
        return raio * raio;
    }
}