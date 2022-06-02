package com.company.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeracoes;

import com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao.Conta;
import com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao.Principal;

public class ContaPagarPacotesEEnumeracoes extends Conta {
    String descricao;
    double valor;
    String dataVencimento;
    Principal.Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public ContaPagarPacotesEEnumeracoes(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public ContaPagarPacotesEEnumeracoes() {
        this.situacaoConta = SituacaoConta.PENDENTE;    // No construtor padrão (o que não recebe parâmetros) da classe ContaPagar,
        // atribua a constante PENDENTE (da SituacaoConta) à variável "situacaoConta",
        // assim, todas as contas a pagar instanciadas ficarão com o status PENDENTE por padrão.
    }

    public ContaPagarPacotesEEnumeracoes(String descricao, double valor, String dataVencimento, Principal.Fornecedor fornecedor) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public ContaPagarPacotesEEnumeracoes(Principal.Fornecedor mercado, String comprasDoMes, double v, String s) {
    }

    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga." + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada." + this.getDescricao());

        } else {

            System.out.println("Pagando conta " + this.getDescricao() +
                    " no valor de " + this.getValor() +
                    " e vencimento em " + this.getDataVencimento() +
                    " do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
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
        public String getDescricao () {
            return descricao;
        }

        public void setDescricao (String descricao){
            this.descricao = descricao;
        }

        public Double getValor () {
            return valor;
        }

        public void setValor ( double valor){
            this.valor = valor;
        }

        public String getDataVencimento () {
            return dataVencimento;
        }

        public void setDataVencimento (String dataVencimento){
            this.dataVencimento = dataVencimento;
        }

        public Principal.Fornecedor getFornecedor () {
            return fornecedor;
        }

        public void setFornecedor (Principal.Fornecedor fornecedor){
            this.fornecedor = fornecedor;

        }
    }


