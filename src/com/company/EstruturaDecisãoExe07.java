/*
* Faça um programa que leia 3 números e mostre o maior e o menor deles.
*
* */

package com.company;

import java.util.Scanner;

public class EstruturaDecisãoExe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        Double primeiroValor = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        Double segundoValor = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        Double terceiroValor = scanner.nextDouble();

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor){
            System.out.println("\nO maior valor é: " + primeiroValor);
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor){
            System.out.println("\nO maior valor é: " + segundoValor);
        } else {
            System.out.println("\nO Maior valor é: " + terceiroValor);
        }
        if (primeiroValor < segundoValor && primeiroValor < terceiroValor){
            System.out.println("\nO menor valor é: " + primeiroValor);
        } else if (segundoValor < primeiroValor && segundoValor < terceiroValor){
            System.out.println("\nO menor valor é: " + segundoValor);
        } else {
            System.out.println("\nO menor valor é: " + terceiroValor);
        }
        scanner.close();
    }
}
