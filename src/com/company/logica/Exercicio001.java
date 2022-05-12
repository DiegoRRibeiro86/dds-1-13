package com.company.logica;

/*
* Para criar uma calculadora simples, você  vai precisar receber  três informações pelo console.
* São os dois números que participaão da operação e também a operação que será realizada.
*
* Você vai receber o primeiro número, depois vai receber qual é a operação, e por último, o segundo número.
*
* Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui (Scanner).
* Para receber a operação você pode receber também um númer oque vai indicar a mesma. Por exemplo, o número 1 será adição,
* o 2 subtração, o 3 multiplicação e o 4 divisão.
*
* Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão "if" para
* só realizar a aperação que o usuário escolheu, Se estiver com dúvidas, então volte ao material onde falamos sobre
* alteração do valor de uma variável. */

import java.util.Scanner;

public class Exercicio001 {

    static final Integer TIPO_ADICAO = 1;
    static final Integer TIPO_SUBTRACAO = 2;
    static final Integer TIPO_MULTIPLICACAO = 3;
    static final Integer TIPO_DIVISAO = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("------- Calculadora -------");
        System.out.println("\n");
        System.out.print("Digite o primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.println("Escolha o tipo de operação desejada: [1] Adição - [2] Subtração - [3] Multiplicação - [4] Divisão ");
        int operacao = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        Double numero2 = scanner.nextDouble();

        Boolean escolheuSoma = operacao == TIPO_ADICAO;
        Boolean escolheuSubtracao = operacao == TIPO_SUBTRACAO;
        Boolean escolheuMultiplicacao = operacao == TIPO_MULTIPLICACAO;
        Boolean escolheuDivisao = operacao == TIPO_DIVISAO;

        if(escolheuSoma){
            System.out.print("A soma dos números é: " + (numero1 + numero2));
        }
        else if (escolheuSubtracao){
            System.out.print("A subtração dos números é: " + (numero1 - numero2));
        }
        else if(escolheuMultiplicacao){
            System.out.print("A multiplicação dos números é: " + (numero1 * numero2));
        }
        else if (escolheuDivisao){
            System.out.print("A divisão dos números é: " + (numero1 / numero2));
        }
        else {
            System.out.println("Operação inválida!");
        }

        scanner.close();
    }

}
