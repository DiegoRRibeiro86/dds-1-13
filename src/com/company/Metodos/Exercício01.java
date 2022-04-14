package com.company.Metodos;
/*
Crie um segundo método no algoritmo da aula passada.
 */

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "] " + cursos[i]);
        }
        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = PosicaoValidaCurso(cursos, posicaoCursoEscolhido);
        if (!posicaoValida) {
            encerrarProgramaPorCausaDePosicaoInvalida();
        }
        imprimirTraco();
        String[] formasPagamento = new String[]{"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamento abaixo: ");
        for (int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + i + "] " + formasPagamento[i]);
        }
        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
        posicaoValida = posicaoValidaFormaDePagamento(formasPagamento, posicaoFormaPagamentoEscolhida);
        if (!posicaoValida) {
            encerrarProgramaPorCausaDePosicaoInvalida();
        }
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
        imprimirTraco();
        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida + ".");
        scanner.close();
    }

    private static boolean PosicaoValidaCurso(String[] cursos, Integer posicaoCursoEscolhido) {
        return posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
    }

    private static boolean posicaoValidaFormaDePagamento(String[] formasPagamento, Integer posicaoFormaPagamentoEscolhida) {
        return posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;
    }

    private static void encerrarProgramaPorCausaDePosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }
}

