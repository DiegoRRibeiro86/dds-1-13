package com.company.novidades_do_java_8.referencia_a_metodos.dao;

import com.company.novidades_do_java_8.referencia_a_metodos.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        // Obviamente você buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("diego@diego.com", 350.0));
        faturas.add(new Fatura("maria@maria.com", 350.0));
        faturas.add(new Fatura("jose@jose.com", 350.0));

        return faturas;
    }
}
