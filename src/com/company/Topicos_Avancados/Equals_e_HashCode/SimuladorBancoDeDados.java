package com.company.Topicos_Avancados.Equals_e_HashCode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<Aluno> buscarAlunos() {
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Ricardo"));
        alunos.add(new Aluno("Thiago"));
        alunos.add(new Aluno("Maria"));

        return alunos;
    }
}
