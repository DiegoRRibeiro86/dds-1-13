/*
* Faça um programa que pergunte o preço de 3 produtos e informe qual produto
* você deve comprar, sabendo que a decisão é sempre pelo mais barato.
*
* */

package com.company.Estrutura_de_decisao;

import java.util.Scanner;


public class EstruturaDecisãoExe08 {

    static final Integer MENOR_VALOR = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salmão: ");
        Double valorSalmao = scanner.nextDouble();
        System.out.print("Digite o valor da tilápia: ");
        Double valorTilapia = scanner.nextDouble();
        System.out.print("Digite o valor da lagosta: ");
        Double valorLagosta = scanner.nextDouble();

        if (valorSalmao < MENOR_VALOR){
            System.out.println("\nVocê deve comprar: Salmão!");
        } else if (valorTilapia < MENOR_VALOR){
            System.out.println("\nVocê deve comprar: Tilápia!");
        } else {
            System.out.println("\nVocê deve comprar: Lagosta!");
        }
        scanner.close();
    }
}
