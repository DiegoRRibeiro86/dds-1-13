package com.company.orientacao_a_objetos_parte_2.sobreposicao;
import java.util.Date;
public class ProdutoPerecivel extends Produto {
    protected Date dataValidade;     // Date.util
    public void identificar() {
     super.identificar();
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}
