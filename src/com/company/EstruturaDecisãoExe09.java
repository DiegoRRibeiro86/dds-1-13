/*
* Faça um programa que leia 3 números e mostre-os em ordem decrescente.
*
* */

package com.company;

import java.util.Scanner;

public class EstruturaDecisãoExe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indice = 3;
        int numeros[] = new int[indice];

        for (int contador = 0; contador < 3; contador ++){
            System.out.println("Informe o valor de " + contador + "° na posição do vetor: ");
            numeros[contador] = scanner.nextInt();
        }

        for (int contador = 2; contador >= 0; contador --){
            System.out.println(" ");
            System.out.println(numeros[contador]);
        }
        scanner.close();
        }
    }


