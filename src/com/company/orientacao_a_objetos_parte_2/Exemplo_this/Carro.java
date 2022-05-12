package com.company.orientacao_a_objetos_parte_2.Exemplo_this;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabrcacao;
    boolean biCombustivel;
    void alterarModelo (String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }
    }
    void ligar() {
        if(modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}
