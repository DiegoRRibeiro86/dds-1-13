package com.company.orientacao_a_objetos_parte_2.Interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
    private int numero;                 // classe privada;
    public NotaFiscal(int numero) {     // construtor;
        this.numero = numero;

    }
    public void adicionarPedido(String produto){        // método;

    }
    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o email: " + email);
    }
}
