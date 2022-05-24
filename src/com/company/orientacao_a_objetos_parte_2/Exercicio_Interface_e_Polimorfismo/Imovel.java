package com.company.orientacao_a_objetos_parte_2.Exercicio_Interface_e_Polimorfismo;

public class Imovel implements Seguravel{
    private double valorMercado;
    private double areaConstruida;

    public Imovel(double valorDeMercado, double areaConstruida) {
        this.valorMercado = valorDeMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String obterDescricao() {
        return "Imóvel com área construida de " + this.areaConstruida + " m2 e valor de mercado " + this.valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.05);
        return valorApolice;
    }
}
