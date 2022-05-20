package com.company.orientacao_a_objetos_parte_2.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("Matheus",32);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Flavia", 25);
    }
}
