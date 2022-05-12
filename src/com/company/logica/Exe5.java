package com.company.logica;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um valor em metros para ser convertido em centímetros: ");
        Double metros = scanner.nextDouble();

        Double calc = metros * 100;

        System.out.println(metros + " metros corresponde a " + calc + " centímetros.");

        scanner.close();
    }
}
