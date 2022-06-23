package com.company.novidades_do_java_8.interfaces_funcionais.impressao;

import com.company.novidades_do_java_8.interfaces_funcionais.compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}
