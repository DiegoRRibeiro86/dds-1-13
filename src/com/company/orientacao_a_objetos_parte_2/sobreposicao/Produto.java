package com.company.orientacao_a_objetos_parte_2.sobreposicao;
public class Produto {
    protected String descricao;         // protected está disponível apenas para quem está dentro do pacote.
    public void identificar() {
        System.out.println("Minha descrição é: " + descricao + ".");
    }
}
