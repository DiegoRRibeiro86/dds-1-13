package com.company.orientacao_a_objetos_parte_2.enumeracoes;

public class Carta {
    private int numero;     // criou essas duas propriedades de Carta, numero e naipe.
    private  Naipe naipe;

    public Carta(int numero, Naipe naipe) { // criou-se um construtor Carta.
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){    // criou esse método para imprimir o sout abaixo.
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor " + naipe.getCor());
    }
}
