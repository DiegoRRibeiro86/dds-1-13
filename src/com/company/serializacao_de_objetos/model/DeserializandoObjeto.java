package com.company.serializacao_de_objetos.model;

import java.io.*;

public class DeserializandoObjeto {

    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("joao.obj"))) {
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro convertendo para a classe Pessoa.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
