package com.company.serializacao_de_objetos.model;

import java.io.*;

public class SerializandoObjeto {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro salvando o objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
