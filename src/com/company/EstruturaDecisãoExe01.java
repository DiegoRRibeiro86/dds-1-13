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
        Boolean primeiroNumeroMaiorQueSegundoNumeroESegundoNumeroMenorQuePrimeiroNumero =
                primeiroNumero > segundoNumero || segundoNumero < primeiroNumero;
        Boolean segundoNumeroMaiorQuePrimeiroEPrimeiroNumeroMenorQueSegundonumero =
                segundoNumero > primeiroNumero || primeiroNumero < segundoNumero;
        if (primeiroNumeroMaiorQueSegundoNumeroESegundoNumeroMenorQuePrimeiroNumero) {
            System.out.println("\nO maior número é: " + primeiroNumero);
        } else if (segundoNumeroMaiorQuePrimeiroEPrimeiroNumeroMenorQueSegundonumero) {
            System.out.println("\nO maior número é: " + segundoNumero);
        } else{
            System.out.println("\nOs números são iguais.");
        }
        scanner.close();
    }
}
