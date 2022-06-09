package com.company.Topicos_Avancados.Ordenando_Objetos;

public class Pessoa implements Comparable<Pessoa>{  // Primeiro criou os privates, depois fez getters and setters, depois @Override toString, então
                                                    // fez implements Comparable<Pessoa> e a partir daqui criou-se o segundo @Override
                                                    // e acrescentou (Pessoa pessoa) e o return nome.compareTo(pessoa.getNome());

    private String nome;
    private int idade;

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

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return nome.compareTo(pessoa.getNome());
    }
}
