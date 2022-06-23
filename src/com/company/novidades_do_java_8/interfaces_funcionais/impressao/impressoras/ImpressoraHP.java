package com.company.novidades_do_java_8.interfaces_funcionais.impressao.impressoras;

import com.company.novidades_do_java_8.interfaces_funcionais.compra.Compra;
import com.company.novidades_do_java_8.interfaces_funcionais.impressao.Impressora;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c) {
        System.out.println("Enviando comando para a impressora HP -> " + c);
    }
}
