package com.company.Topicos_Avancados.Equals_e_HashCode;

import java.util.Set;

public class TesteSetHashSet2 {

    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        // De alguma forma, sorteia o nome de aluno e constroi o ojeto Aluno
        Aluno alunoSrteado = new Aluno("Maria");

        if (alunos.contains(alunoSrteado)) {
            System.out.println("Parabés! " + alunoSrteado.getNome() + "Você ganhou um brinde!");
        } else {
            System.out.println("Aluno nãocadastrado no banco de dados.");
        }
    }
}
