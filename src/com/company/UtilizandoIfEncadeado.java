package com.company;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        boolean pesoLeve = (peso <= 60) && (peso > 0);
        Boolean pesoMedio = (peso > 60) && (peso <= 90);
        Boolean pesoPesado = peso > 90;

        if (pesoLeve) {
            System.out.println("O lutador é peso leve.");
        }else if (pesoMedio) {
            System.out.println("O lutador é peso médio.");
        }else if (pesoPesado) {
            System.out.println("O lutador é peso pesado.");
        }else {
            System.out.println("O lutador não se encaixa em categoria alguma.");
        }
        scanner.close();
        }
    }

