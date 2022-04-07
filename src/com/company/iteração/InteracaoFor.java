package com.company.iteração;

public class InteracaoFor {
    public static void main(String[] args) {
        /*Integer[] produtos = new Integer[] {100, 225, 300};

        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];

            System.out.println("Produto de Código: " + produto);

            if (produto.equals(225)) {
                System.out.println("Produto encontrado.");
                break;
            }
        }/*
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": EUamo Java!");
        }*/

        Double[] carrinhoCompras = new Double[] {50.0,51.0,52.0};
        Double total = 0.0;
        for (int i = 0; i< carrinhoCompras.length; i++) {
            System.out.println("Iteração: " + i + ", Total: " + total);
            total = total + carrinhoCompras[i];
        }

        System.out.println("Total: " + total);
    }
}
