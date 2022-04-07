/*
* Faça um programa que leia 3 números e mostre o maior deles.
*
* */

package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisãoExe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        Double primeiroValor = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        Double segundoValor = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        Double terceiroValor = scanner.nextDouble();
        Boolean primeiroNumeroEmaior = primeiroValor >= segundoValor && primeiroValor > terceiroValor;
        Boolean segundoNumeroEmaior = segundoValor >= primeiroValor && segundoValor > terceiroValor;
        if (primeiroNumeroEmaior){
            System.out.print("\nO maior valor é: " + primeiroValor);
        } else if (segundoNumeroEmaior){
            System.out.println("\nO maior valor é: " + segundoValor);
        } else {
            System.out.println("\nO Maior valor é: " + terceiroValor);
        }
        scanner.close();
    }
}
