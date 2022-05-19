package com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao;

import com.company.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeracoes.SituacaoConta;

public class Conta {
    String descricao;
    double valor;
    String dataVencimento;
    Principal.Fornecedor fornecedor;
    SituacaoConta situacaoConta;

    public void ContaPagar(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;    // No construtor padrão (o que não recebe parâmetros) da classe ContaPagar,
        // atribua a constante PENDENTE (da SituacaoConta) à variável "situacaoConta",
        // assim, todas as contas a pagar instanciadas ficarão com o status PENDENTE por padrão.
    }
    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que poi paga." + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que foi cancelada" + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            // altera a situação da conta para CANCELADA.
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    protected String getDescricao() {
        return descricao;
    }

    public enum ContaPagar {
        ;

        public void setDescricao(String aluguel_da_matriz) {
        }

        public void setValor(double v) {
        }

        public void setDataVencimento(String s) {
        }

        public void setFornecedor(Principal.Fornecedor imobiliaria) {
        }

        public void pagar() {
        }
    }
}
