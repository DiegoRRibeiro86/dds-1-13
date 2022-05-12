package com.company.logica;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o peso em kg de peixes: ");
        Double pesoDePeixes = scanner.nextDouble();
        System.out.println();

        double excesso = obterPeso(pesoDePeixes);
        double multa = obterMulta(excesso);

        System.out.println("João, você trouxe " + pesoDePeixes + "kg de peixe. Como o peso excedeu o limite de 50 kg: "
           + excesso + "kg. Você terá que pagar uma multa de R$ 4 para cada kg excedente, resultando em: R$" + multa);

        scanner.close();

    }

    private static double obterPeso(Double pesoDePeixes) {
        return pesoDePeixes - 50;
    }

    private static double obterMulta(double excesso) {
        return excesso * 4;
    }
}
