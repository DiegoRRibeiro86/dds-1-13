package com.company.Topicos_Avancados.Desafio_Collections;

import java.math.BigDecimal;

public class Cargo {

    private String descricao;
    private BigDecimal salario;

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getSalario() {
        return this.salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}