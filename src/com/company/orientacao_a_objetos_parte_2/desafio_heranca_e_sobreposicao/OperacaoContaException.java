package com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao;

public class OperacaoContaException extends Exception {
    public OperacaoContaException(String msg) {     // Criação do Construtor. Esse método recebe o parâmetro 'msg' e invoca a super classe 'Exception'.
        super(msg);
    }
}
