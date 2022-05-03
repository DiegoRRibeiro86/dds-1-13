package com.company.programacao_orientada_a_objetos.primeira_classe;

public class exercicio02 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Carro";
        produto.precoUnitario = 30.000;
        produto.quantidadeEmEstoque = 10;
        System.out.println("É necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());

    }
}
