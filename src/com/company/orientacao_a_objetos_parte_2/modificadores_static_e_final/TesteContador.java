package com.company.orientacao_a_objetos_parte_2.modificadores_static_e_final;

public class TesteContador {
    public static void main(String[] args) {    // a classe teste precisa do main para ser executado.
        Contador c = new Contador();            // injetar um objeto de outra classe.
        c.incrementar();
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        Contador.imprimirContador();
    }
}
