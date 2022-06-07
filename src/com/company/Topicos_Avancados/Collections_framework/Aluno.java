package com.company.Topicos_Avancados.Collections_framework;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome) { //Construtor
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

