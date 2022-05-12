package com.company.logica;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite sua primeira nota: ");
        Double n1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        Double n2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        Double n3 = scanner.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        Double n4 = scanner.nextDouble();

        Double n5 = n1 + n2 + n3 + n4;

        Double media = n5 / 4;

        System.out.println("Sua média é : " + media + ".");

        scanner.close();

    }
}
