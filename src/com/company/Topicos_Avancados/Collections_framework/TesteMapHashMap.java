package com.company.Topicos_Avancados.Collections_framework;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");

        Map<String, Aluno> alunos = new HashMap<>(); /// Os elementos na estrutura Hash estarão sempre ligados por uma chave "1","2"...

        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("5", a4);

        ImprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());

    }

    private static void ImprimirAlunos(Map<String, Aluno> alunos) {
        for (Aluno a : alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }


}
