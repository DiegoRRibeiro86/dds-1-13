package com.company.logica;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número: ");

        Integer n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");

        Integer n2 = scanner.nextInt();

        Integer n3 = n1 +n2;

        System.out.println("O resultado da soma dos números é :" + n3 );

        scanner.close();




    }
}
