package com.company.orientacao_a_objetos_parte_2.heranca_e_modificador_protected;

import com.company.orientacao_a_objetos_parte_2.desafio_heranca_e_sobreposicao.Pessoa;

public class Jogador extends Pessoa {
    protected boolean aindaJoga = false;
    public void dizerSeAindaJoga() {        //void => quando o método não retorna nenhum valor.
        System.out.println("Ainda joga? " + aindaJoga);
    }
}
