package com.company.orientacao_a_objetos_parte_2.Exercicio_Interface_e_Polimorfismo;

public class Carro implements Seguravel{

    private int anoFabricacao;
    private double valorMercado;

    public Carro(int anoFabricacao, double valorMercado) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }

        return valorApolice;
    }
}
