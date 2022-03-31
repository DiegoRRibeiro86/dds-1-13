package com.company;

import java.util.Scanner;

public class EstruturaDecisaoExe13 {

    static final Integer DOMINGO = 1;
    static final Integer SEGUNDA = 2;
    static final Integer TERCA = 3;
    static final Integer QUARTA = 4;
    static final Integer QUINTA = 5;
    static final Integer SEXTA = 6;
    static final Integer SABADO = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número de 1 a 7: ");
        double numeroDaSemana = scanner.nextDouble();

        if (numeroDaSemana == DOMINGO){
            System.out.println("1 - Domingo.");
        } else if (numeroDaSemana == SEGUNDA){
            System.out.println("2 - Segunda-feira.");
        } else if (numeroDaSemana == TERCA){
            System.out.println("3 - Terça-feira.");
        } else if (numeroDaSemana == QUARTA){
            System.out.println("4 - Quarta-feira.");
        } else if (numeroDaSemana == QUINTA){
            System.out.println("5 - Quinta-feira.");
        } else if (numeroDaSemana == SEXTA){
            System.out.println("6 - Sexta-feira.");
        } else if (numeroDaSemana == SABADO){
            System.out.println("7 - Sábado.");
        } else {
            System.out.println("\nNúmero inválido!");
        }

        scanner.close();
        }
    }

