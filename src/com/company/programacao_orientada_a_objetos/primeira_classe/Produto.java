package com.company.programacao_orientada_a_objetos.primeira_classe;

public class Produto {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    Integer quantidadeEmEstoque;

    String nome;

    Double precoUnitario;

    Integer quantidade;

    Boolean eNecessarioReporEstoque() {
        return quantidadeEmEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
