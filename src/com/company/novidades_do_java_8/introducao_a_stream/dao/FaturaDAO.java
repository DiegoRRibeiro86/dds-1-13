package com.company.novidades_do_java_8.introducao_a_stream.dao;

import com.company.novidades_do_java_8.introducao_a_stream.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarTodasFaturas() {
        // Obviamente vocêbuscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura( " diego@diego.com",350.0));
        faturas.add(new Fatura( " marie@marie.com",230.0));
        faturas.add(new Fatura( " jane@jane.com",150.0));

        return faturas;

    }
}
