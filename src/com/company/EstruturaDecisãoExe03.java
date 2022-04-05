/*
* Faça um programa que verifique se uma letra digitada é 'F' ou 'M'.
* Conforme a letra escrever: F - Feminino, M - Masculino, Sexo inválido.
*
* */

package com.company;
import java.util.Scanner;

public class EstruturaDecisãoExe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Defina seu sexo: [M] Masculino | [F] Feminino: ");
        Character escolhaSexo = scanner.next().charAt(0);

        Boolean sexoMasculino = escolhaSexo.equals('M')  || escolhaSexo.equals('m');
        Boolean sexoFeminino = escolhaSexo.equals('F') || escolhaSexo.equals('f');
        Boolean imputInvalido = !sexoMasculino && !sexoFeminino;

        if (imputInvalido) {
            System.out.println("Imput inválido.");
        } else {
            if (sexoFeminino) {
                System.out.println("[" + escolhaSexo + "]" + " Feminino.");
            } else if (sexoMasculino) {
                System.out.println("[" + escolhaSexo + "]" + " Masculino.");
            }
        }
        scanner.close();
    }
}
