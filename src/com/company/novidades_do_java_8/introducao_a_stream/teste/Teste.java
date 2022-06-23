package com.company.novidades_do_java_8.introducao_a_stream.teste;

import com.company.novidades_do_java_8.introducao_a_stream.dao.FaturaDAO;
import com.company.novidades_do_java_8.introducao_a_stream.modelo.Fatura;

import javax.sound.midi.Soundbank;
import java.net.Socket;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();

       /* for (Fatura f : faturas) {
            if (f.getValor() > 250.0) {
                System.out.println("Alerta! Fatura acima de R$ 250.0 -> " + f);
            }
        }*/

        faturas.stream()
                .filter(Fatura::estaEmRisco)
                .forEach(System.out::println);
    }
}
