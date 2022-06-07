package com.company.Topicos_Avancados.Desafio_Collections;

import java.util.Objects;

public class Politico {
    private String nome;
    private Cargo cargo;

    public Politico(String nome) {
        this.nome = nome;
    }

    public static void put(String s, Politico p1) {
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Politico politico = (Politico) o;
        return Objects.equals(nome, politico.nome) && Objects.equals(cargo, politico.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cargo);
    }
}
