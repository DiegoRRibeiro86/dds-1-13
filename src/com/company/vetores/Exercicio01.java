package com.company.vetores;

/*
 *
 * Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
 *  Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefasDiarias = new String[5];

        for (int i =0; i < tarefasDiarias.length ; i++) {
            System.out.println("Digite na posição " + i + " sua tarefa diária: ");
            String tarefa = scanner.next();
        }
        System.out.println(tarefasDiarias);
    }

}