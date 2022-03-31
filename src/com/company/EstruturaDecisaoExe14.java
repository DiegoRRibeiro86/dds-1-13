package com.company;

import java.util.Scanner;

public class EstruturaDecisaoExe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua primeira nota em Inglês: ");
        double primeiraNotaEmIngles = scanner.nextDouble();
        System.out.print("Informe sua segunda nota em Inglês: ");
        double segundaNotaEmIngles = scanner.nextDouble();

        double mediaDasNotasEmIngles = (primeiraNotaEmIngles + segundaNotaEmIngles) /2;

        if (mediaDasNotasEmIngles == 9 && mediaDasNotasEmIngles == 10){

        }
    }
}
