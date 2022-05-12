package com.company.logica;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o tamanho, em metros quadrados, da área a ser pintada: ");
        Double metros = scanner.nextDouble();
        int coberturaTintaMetrosQuadrados = 3;
        int capacidadeLataEmLitros = 18;
        int precoLataTinta = 80;
        double litrosGastos = obterLitrosGastos(metros, coberturaTintaMetrosQuadrados);
        double latasgastas = obterLatas(capacidadeLataEmLitros, litrosGastos);
        double precoTotal = obterPrecoTotal(precoLataTinta, latasgastas);
        System.out.println("Quantidade de litros: " + litrosGastos);
        System.out.println("Quantidade de latas: " + latasgastas);
        System.out.println("Preço total: R$ " + precoTotal);

        scanner.close();
    }

    private static double obterPrecoTotal(int precoLataTinta, double latasgastas) {
        return latasgastas * precoLataTinta;
    }

    private static double obterLatas(int capacidadeLataEmLitros, double litros) {
        return Math.ceil(litros / capacidadeLataEmLitros);
    }

    private static double obterLitrosGastos(Double metros, int coberturaTintaMetrosQuadrados) {
        return metros / coberturaTintaMetrosQuadrados;
    }
}
