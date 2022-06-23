package com.company.novidades_do_java_8.referencia_a_metodos.exemplo;

import com.company.novidades_do_java_8.referencia_a_metodos.dao.FaturaDAO;
import com.company.novidades_do_java_8.referencia_a_metodos.modelo.Fatura;

import java.util.List;

public class Exemplo {

    public static void main(String[] args) {

        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        /* for (Fatura f : faturasVencidas) {
            f.atualizarStatus();
        }*/

        // faturasVencidas. forEach (f -> f.atualizarStatus());

        faturasVencidas.forEach(Fatura::atualizarStatus);
    }
}
