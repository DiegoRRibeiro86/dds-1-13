package com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao;

import com.company.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeracoes.SituacaoConta;

public class Conta {
    protected SituacaoConta situacaoConta;
    private String Descricao;
    private Double Valor;
    private String DataVencimento;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public void cancelar() throws OperacaoContaException{
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public Double getValor() {
        return this.Valor;
    }

    public void setValor(Double valor) {
        this.Valor = valor;
    }

    public String getDataVencimento() {
        return this.DataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.DataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return this.situacaoConta;
    }
}

