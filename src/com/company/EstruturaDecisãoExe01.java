/*
* Faça um programa que peça dois números e imprima o maior deles.
*
* */

package com.company;

import java.util.Scanner;

public class EstruturaDecisãoExe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();

        if (primeiroNumero > segundoNumero || segundoNumero < primeiroNumero){
            System.out.print("\nO maior número é: " + primeiroNumero);
        } else {
            System.out.print("\nO maior número é: " + segundoNumero);
        }
        scanner.close();
    }
}
