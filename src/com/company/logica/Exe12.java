package com.company.logica;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        Double imc = obterImc(altura);

        System.out.println("Seu peso ideal é: " + imc);

        scanner.close();
    }

    private static double obterImc(Double altura) {
        return (72.7 * altura) - 58;
    }
}
