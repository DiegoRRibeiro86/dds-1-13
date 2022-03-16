package com.company;

/* Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
   coma previdência, depois verifique se ela pode aposentar ou não.

   Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuido com pelo menos 25 anos.
   e ela passar nessas duas condições, então mostre para ela uma mensagemque ela pode aposentar. */

import java.util.Scanner;
public class Exercicio04 {
    static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
    static final Integer TEMPO_CONTRIBUICAO_MINIMO = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Double idade = scanner.nextDouble();
        System.out.print("Digite o tempo de contribuição: ");
        Double tempoContribuicao = scanner.nextDouble();

        Boolean podeAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        Boolean tempoDeContribuicao = tempoContribuicao >= TEMPO_CONTRIBUICAO_MINIMO;

        if (podeAposentar & tempoDeContribuicao) {
            System.out.println("Você já pode se aposentar.");
        } else {
            System.out.println("\nVocê não pode se aposentar ainda.");
        }

        scanner.close();
    }
}
