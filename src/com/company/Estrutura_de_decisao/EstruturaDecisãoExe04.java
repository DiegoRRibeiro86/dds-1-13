/*
* Faça um programa que verifique se uma letra digitada é vogal ou consoante.
*
* */

package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisãoExe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um letra: ");
        Character letraInformada = scanner.next().charAt(0);

        if (letraInformada == 'a' || letraInformada == 'A' || letraInformada == 'e' || letraInformada == 'E'
                || letraInformada == 'i' || letraInformada == 'I' || letraInformada == 'o' | letraInformada == 'O'
                || letraInformada == 'u' || letraInformada == 'U') {
            ;
            System.out.println("A letra escolhida '" + letraInformada + "' é uma vogal.");
        } else {
            System.out.println("A letra escolhida '" + letraInformada + "' é uma consoante.");
        }
        scanner.close();
    }
}
