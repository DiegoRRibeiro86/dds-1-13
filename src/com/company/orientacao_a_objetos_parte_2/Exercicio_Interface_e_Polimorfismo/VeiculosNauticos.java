package com.company.orientacao_a_objetos_parte_2.Exercicio_Interface_e_Polimorfismo;

public class VeiculosNauticos implements Seguravel{
    private double valorMercado;
    private int modeloAno;

    public VeiculosNauticos(double valorMercado, int modelo) {
        this.valorMercado = valorMercado;
        this.modeloAno = modelo;
    }

    @Override
    public String obterDescricao() {
        return "Modelo do tipo " + this.modeloAno + " com valor de mercado " + this.valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if ( modeloAno < 2000) {
            valorApolice = valorApolice * 0.90;
        }

        return valorApolice;
    }
}
