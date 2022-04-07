package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisaoExe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua primeira nota em Inglês: ");
        double primeiraNotaEmIngles = scanner.nextDouble();
        System.out.print("Informe sua segunda nota em Inglês: ");
        double segundaNotaEmIngles = scanner.nextDouble();

        double mediaDasNotasEmIngles = (primeiraNotaEmIngles + segundaNotaEmIngles) /2;

        if (mediaDasNotasEmIngles >= 9.0 && mediaDasNotasEmIngles <= 10.0){
            System.out.println("Sua primeira nota foi: " + primeiraNotaEmIngles);
            System.out.println("Sua segunda nota foi: " + segundaNotaEmIngles);
            System.out.println("Sua média foi: " + mediaDasNotasEmIngles);
            System.out.println("Você tirou um 'A'!");
            System.out.println("Aprovado!");
        } else if (mediaDasNotasEmIngles >=7.5 && mediaDasNotasEmIngles < 9.0){
            System.out.println("Sua primeira nota foi: " + primeiraNotaEmIngles);
            System.out.println("Sua segunda nota foi: " + segundaNotaEmIngles);
            System.out.println("Sua média foi: " + mediaDasNotasEmIngles);
            System.out.println("Você tirou um 'B'!");
            System.out.println("Aprovado!");
        } else if (mediaDasNotasEmIngles >=6.5 && mediaDasNotasEmIngles < 7.5){
            System.out.println("Sua primeira nota foi: " + primeiraNotaEmIngles);
            System.out.println("Sua segunda nota foi: " + segundaNotaEmIngles);
            System.out.println("Sua média foi: " + mediaDasNotasEmIngles);
            System.out.println("Você tirou um 'C'!");
            System.out.println("Aprovado!");
        } else if (mediaDasNotasEmIngles >= 4.0 && mediaDasNotasEmIngles <= 6.0){
            System.out.println("Sua primeira nota foi: " + primeiraNotaEmIngles);
            System.out.println("Sua segunda nota foi: " + segundaNotaEmIngles);
            System.out.println("Sua média foi: " + mediaDasNotasEmIngles);
            System.out.println("Você tirou um 'D'!");
            System.out.println("Reprovado!");
        } else if (mediaDasNotasEmIngles >= 4.0 && mediaDasNotasEmIngles == 0){
            System.out.println("Sua primeira nota foi: " + primeiraNotaEmIngles);
            System.out.println("Sua segunda nota foi: " + segundaNotaEmIngles);
            System.out.println("Sua média foi: " + mediaDasNotasEmIngles);
            System.out.println("Você tirou um 'E'!");
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
