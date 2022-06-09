package com.company.Topicos_Avancados.Desafio_Collections;

import java.util.Objects;

public class Politico {
    private String nome;
    private Cargo cargo;

    public Politico() {

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

}
