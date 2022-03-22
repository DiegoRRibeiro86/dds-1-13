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

        if (escolhaSexo == 'F' || escolhaSexo == 'f') {
            System.out.println("[" + escolhaSexo + "]" + " Feminino.");
        } else if (escolhaSexo == 'M' || escolhaSexo == 'm'){
            System.out.println("[" + escolhaSexo + "]" + " Masculino.");
        } else{
            System.out.print("\nSexo inválido.");
        }
        scanner.close();
    }
}
