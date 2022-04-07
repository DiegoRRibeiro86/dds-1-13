package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisaoExe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR RAÍZES DE UMA EQUAÇÃO DO SEGUNDO GRAU");
        System.out.println("\n");
        System.out.print("Informe o valor de 'A': ");
        double valorDeA = scanner.nextDouble();
        System.out.print("Informe o valor de 'B': ");
        double valorDeB = scanner.nextDouble();
        System.out.println("Informe o valor de 'C': ");
        double valorDeC = scanner.nextDouble();

        double formulaDeDelta = (valorDeB * 2) - (4 * valorDeC * valorDeA);


        if (valorDeA == 0) {
            System.out.println("A equação não é de segundo grau.");


            }
        }
    }

