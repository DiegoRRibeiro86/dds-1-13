package com.company.orientacao_a_objetos_parte_2.classes_abstratas;

public abstract class Produto {      //Começa criando os atributos.
    String descricao;
    public abstract void imprimirDescricao();        // Cria método abstrato.

    public String getDescricao() {
        return descricao;
    }
}
