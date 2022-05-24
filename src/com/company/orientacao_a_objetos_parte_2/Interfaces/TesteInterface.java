package com.company.orientacao_a_objetos_parte_2.Interfaces;

public class TesteInterface {
    public static void main(String[] args) {            // método main;
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();                                   // invoca o método Imprimir;
        EnviavelPorEmail e = (EnviavelPorEmail) i;      // colocar o valor de 'i' em 'e';
        e.enviar("diego.executive@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("Caixa de leite");

    }
}
