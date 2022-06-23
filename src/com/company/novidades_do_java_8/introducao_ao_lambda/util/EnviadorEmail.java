package com.company.novidades_do_java_8.introducao_ao_lambda.util;

public class EnviadorEmail {

    public void enviar(String email, String texto) {
        System.out.println("Enviando e-mail para: " + email + ". Com texto: \"" + texto + "\"");
    }
}
