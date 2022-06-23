package com.company.novidades_do_java_8.interfaces_funcionais.teste;

import com.company.novidades_do_java_8.interfaces_funcionais.compra.Compra;
import com.company.novidades_do_java_8.interfaces_funcionais.impressao.Impressora;
import com.company.novidades_do_java_8.interfaces_funcionais.impressao.impressoras.ImpressoraHP;

public class Teste {

    public static void main(String[] args) {
        // Impressora i = new ImpressoraHP();
        //Compra compra = new Compra("Sabonente", 2.5);
        //i.imprimir(compra);

        Impressora i = (c) -> {
            System.out.println("Simulando a impressão. Seria impresso: " + c);
        };

    }
}
