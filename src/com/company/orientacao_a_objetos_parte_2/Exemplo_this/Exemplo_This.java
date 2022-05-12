package com.company.orientacao_a_objetos_parte_2.Exemplo_this;

public class Exemplo_This {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Pálio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alterarModelo("Civic");
        System.out.println("Modelodepois: " + carro.modelo);

    }
}
