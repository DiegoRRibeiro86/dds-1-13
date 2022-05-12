package com.company.orientacao_a_objetos_parte1.Composicao_de_Objetos.Exercicio03;

import com.company.orientacao_a_objetos_parte1.Composicao_de_Objetos.Exercicio03.Produto;

public class Estoque {
    public Produto[] produtos;
    void listarProdutos() {
        System.out.println("Produtos em Estoque");
        System.out.println("---------------------");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].descrever();
        }


    }
}
