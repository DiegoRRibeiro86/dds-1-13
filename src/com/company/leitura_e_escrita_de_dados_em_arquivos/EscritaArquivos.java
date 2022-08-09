package com.company.leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList <String> pessoas = new ArrayList<>();
        ArrayList <String> filmes = new ArrayList<>();

        System.out.println("****** CINE TROLL ******");
        System.out.println("    Faça sua reserva!");

        for (int i = 0; i < 3; i++) {
            System.out.print("Reserva " + i + ": ");
            String nome = scanner.nextLine();

            pessoas.add(nome);

            System.out.println("\nAgora escoha o filme desejado:");
            System.out.println("\n [A] Batman     [B] Os vingadores     [C] Porto Seguro");

            String filmeEscolhido = scanner.nextLine();

            System.out.println();

            if (filmeEscolhido.equals("A") || filmeEscolhido.equals("a")) {
                System.out.println("Batman");
                filmes.add("Batman");
            } else if (filmeEscolhido.equals("B") || filmeEscolhido.equals("b")) {
                System.out.println("Os Vingadores");
                filmes.add("Os Vingadores");
            } else if (filmeEscolhido.equals("C") || filmeEscolhido.equals("c")) {
                System.out.println("Porto Seguro");
                filmes.add("Porto Seguro");
            } else {
                System.out.println("Número inválido!");
            }
        }

        Path arquivo = Paths.get("C:\\Users\\Aluno.LABCETEC\\Desktop\\Arquivo.txt");
        Files.write(arquivo, pessoas);
        Files.write(arquivo, filmes, StandardOpenOption.APPEND);

        scanner.close();
        System.out.println("Fim...");

    }
}
