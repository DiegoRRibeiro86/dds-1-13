package com.company.orientacao_a_objetos_parte1;

public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome ="Diego";
        pessoa.cachorro = new Cachorro();
        pessoa.cachorro.nome = "Mini";

        Caminhada caminhada = new Caminhada();
        caminhada.andar(pessoa);

    }
}
