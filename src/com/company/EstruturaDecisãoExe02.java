/*
* Faça um programa que peça um valor e mostre na tela
* se o valor é positivo ou negativo.
*
* */

package com.company;
import java.util.Scanner;

public class EstruturaDecisãoExe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        float valor = scanner.nextFloat();

        if (valor > 0){
            System.out.println(valor + " O valor é positivo.");
        } else {
            System.out.println(valor + " O valor é negativo.");
        }
    }
}
