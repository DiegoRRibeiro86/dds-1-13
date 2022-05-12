package com.company.logica;

import java.util.Scanner;


public class Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho, em metros quadrados, da área a ser pintada: ");
        Double metros = scanner.nextDouble();
        System.out.println("");

        Double quantidadeLitrosDeTinta = obterQuantidadeLitrosDeTinta(metros);
        Double quantidadeLatasDeTinta18L = obterQuantidadeLatasDeTinta18L(quantidadeLitrosDeTinta);
        Double precoTotalLata = obterPrecoTotalLata(quantidadeLatasDeTinta18L);
        Double lataTintaMenor = obterLataTintaMenor(quantidadeLitrosDeTinta);
        Double precoTotalLataMenor = obterPrecoTotalLataMenor(lataTintaMenor);
        Double precoGalaoELata = obterPrecoGalaoELata(precoTotalLata, precoTotalLataMenor);
        Double precoGalaoELataComFolga = obterPrecoGalaoELataComFolga(precoGalaoELata);

        System.out.println("Latas de tinta de 18 litros a serem compradas: " + quantidadeLatasDeTinta18L);
        System.out.println("Preço total em latas de 18 litros: " + precoTotalLata);
        System.out.println("Latas de tinta de 3,6 litros a serem compradas: " + lataTintaMenor);
        System.out.println("Preço total com latas de 3,6 litros: " + precoTotalLataMenor);
        System.out.println("Preço misturado com 10% de folga: " + precoGalaoELataComFolga);

       scanner.close();

    }

    private static double obterPrecoGalaoELataComFolga(Double precoGalaoELata) {
        return Math.ceil(precoGalaoELata - (precoGalaoELata * 10) / 100);
    }

    private static double obterPrecoGalaoELata(Double precoTotalLata, Double precoTotalLataMenor) {
        return Math.ceil(precoTotalLata + precoTotalLataMenor);
    }

    private static double obterPrecoTotalLataMenor(Double lataTintaMenor) {
        return Math.ceil(lataTintaMenor *25);
    }

    private static double obterLataTintaMenor(Double quantidadeLitrosDeTinta) {
        return Math.ceil(quantidadeLitrosDeTinta / 3.6);
    }

    private static double obterPrecoTotalLata(Double quantidadeLatasDeTinta18L) {
        return Math.ceil(quantidadeLatasDeTinta18L * 80);
    }

    private static double obterQuantidadeLatasDeTinta18L(Double quantidadeLitrosDeTinta) {
        return Math.ceil(quantidadeLitrosDeTinta / 18);
    }

    private static double obterQuantidadeLitrosDeTinta(Double metros) {
        return Math.ceil(metros / 6);
    }

}
