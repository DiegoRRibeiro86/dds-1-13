package com.company.logica;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        Double inteiro1 = scanner.nextDouble();
        System.out.print("Digite mais um número inteiro: ");
        Double inteiro2 = scanner.nextDouble();
        System.out.print("Digite um número real: ");
        Double real = scanner.nextDouble();

        Double resultadoA = obterResultadoA(inteiro1, inteiro2);
        Double resultadoB = obterResultadoB(inteiro1, real);
        Double resultadoC = obterResultadoC(real);


        System.out.println("O prodruto do dobro do primeiro com metade do segundo é: " + resultadoA);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultadoB);
        System.out.println("O terceiro elevado ao cubo é: " + resultadoC);
        scanner.close();

    }

    private static double obterResultadoA(Double inteiro1, Double inteiro2) {
        return (inteiro1 * 2) * (inteiro2 / 2);
    }

    private static double obterResultadoB(Double inteiro1, Double real) {
        return (inteiro1 * 3) + real;
    }

    private static double obterResultadoC(Double real) {
        return real * real * real;
    }


}
