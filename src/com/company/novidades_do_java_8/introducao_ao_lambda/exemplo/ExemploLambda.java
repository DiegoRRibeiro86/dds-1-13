package com.company.novidades_do_java_8.introducao_ao_lambda.exemplo;

import com.company.novidades_do_java_8.introducao_ao_lambda.dao.FaturaDAO;
import com.company.novidades_do_java_8.introducao_ao_lambda.modelo.Fatura;
import com.company.novidades_do_java_8.introducao_ao_lambda.util.EnviadorEmail;

import java.util.List;

public class ExemploLambda {

    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorEmail enviadorEmail = new EnviadorEmail();

       /* for (Fatura f : faturasVencidas) {
            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());

        } */

        faturasVencidas.forEach(f -> {
            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
            f.setEmailEnviado(true);
        });
    }
}
