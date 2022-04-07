package com.company.vetores;

import java.util.Scanner;

public class Vetores1Dimensao {
    public static void main(String[] args) {
        String[] cardapio = new String[] {"Calabresa","Atum","Queijo","Preseunto"};
        System.out.println("Escolha o sabor: ");
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println("[" + i + "]" + cardapio[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número referente ao sabor: ");
        Integer saborEscolhido = scanner.nextInt();
        System.out.println("Você escolheu o sabor: " + cardapio [saborEscolhido]);
        scanner.close();
    }
}
