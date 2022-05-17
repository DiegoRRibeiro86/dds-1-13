package com.company.orientacao_a_objetos_parte_2.enumeracoes;
public enum Naipe {
    OURO("Vermelha."), PAUS("Preta."), ESPADA("Preta."), COPAS("Vermelha."); // começou aqui criando as cartas.
    private String cor;
    Naipe(String cor) {  // criou getters and setters e apagou o setCor e criou um contrutor (botão direito > Generate > Constructor).
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
