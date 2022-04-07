/*
* Faça um programa para a leitura de duas notas parciais de um aluno.
* O programa deve calcular a média por aluno e apresentar:
* A mensagem "Aprovado", se a média alcançada foi igual ou maior a 7.
* A mensagem "Reprovado", se a média for menor que 7.
* A mensagem "Aprovado com distinção", se a média for igual a 10.
*
* */

package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisãoExe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        Double primeiraNota = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        Double segundaNota = scanner.nextDouble();
        Double somaDasNotas = primeiraNota + segundaNota;
        Double media = somaDasNotas / 2;
        Boolean aprovado = media >= 7 && media < 10;
        Boolean aprovadoComDistincao = media == 10;
        if (aprovado) {
            System.out.print("\nSua média foi: " + media + ".");
            System.out.print("\nAprovado! \n");
        } else if (aprovadoComDistincao) {
            System.out.print("\nSua média foi: " + media + ".");
            System.out.print("\nAprovado com distinção! \n");
        } else {
            System.out.print("\nSua média foi: " + media + ".");
            System.out.println("\nReprovado! \n");
        }
        scanner.close();
    }
}
