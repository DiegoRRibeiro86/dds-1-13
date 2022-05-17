package com.company.orientacao_a_objetos_parte_2.modificadores_static_e_final;

public class Contador {
    public static int COUNT = 0;
    public static final double PI = 3.14;
    public void incrementar() {             // um método que não recebe parâmetros.
        COUNT++;
    }
    public static void imprimirContador () {     // tudo o que é public será compartilhado pelos objeto da classe.
        System.out.println("O valor do contador agora é " + Contador.COUNT + ".");
    }

    }

