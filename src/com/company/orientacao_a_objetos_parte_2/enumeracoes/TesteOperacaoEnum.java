package com.company.orientacao_a_objetos_parte_2.enumeracoes;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacoesAritmeticas o1 = OperacoesAritmeticas.ADICAO;
        int resultado1 = o1.operacao(5,3);
        System.out.println("O resultado é " + resultado1);
        OperacoesAritmeticas o2 = OperacoesAritmeticas.SUBTRACAO;
        int resultado2 = o2.operacao(5,3);
        System.out.println("O resultado é " + resultado2);

    }
}
