package com.company.orientacao_a_objetos_parte_2.enumeracoes;
public class TesteEnum {
    public static void main(String[] args) {
        Carta quatroPaus = new Carta(4,Naipe.PAUS); // criou uma variável do tipo Carta, essa variável aponta
        quatroPaus.imprimirCarta();                        // para o endereço de memória Carta, colocando seu número (4) e naipe (PAUS)
    }
}
