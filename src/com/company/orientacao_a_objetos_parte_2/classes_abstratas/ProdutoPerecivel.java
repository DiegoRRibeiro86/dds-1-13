package com.company.orientacao_a_objetos_parte_2.classes_abstratas;

public class ProdutoPerecivel extends Produto{              // Segundo, estende a classe
    String dataValidade;
    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }

}
