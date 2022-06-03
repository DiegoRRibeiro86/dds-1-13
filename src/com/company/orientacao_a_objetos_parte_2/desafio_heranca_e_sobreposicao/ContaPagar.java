package com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao;

import com.company.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeracoes.SituacaoConta;

public class ContaPagar extends Conta{
    private Fornecedor fornecedor;

    public ContaPagar () {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void pagar() throws OperacaoContaException{
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar uma conta que está cancelada: " + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em " + this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}