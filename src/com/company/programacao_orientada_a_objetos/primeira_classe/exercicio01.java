package com.company.programacao_orientada_a_objetos.primeira_classe;
/*
Crie um método que informa a necessidade de relatório de estoque
Crie um programa fornecido em um produto determinado
loja qualquer. Considerar que a quantidade mínima de um produto deva ser 10. Se o estoque for menor que isso, então ele
*true*, pois, retornará a reposição do estoque, caso contrário, ele retornará false.
Como parâmetro, esse método deve receber um tipo que você irá criar e chamar de Produto, ou seja, você vai criar uma
classe chamada Produto com os atributos de atribuição. Os atributos da classe serão nome e quantidadeEstoque.
Feito isso, implemente o método principal do programa. Nele você vai criar uma variável do tipo Produto e depois usar essa
variável para invocar o método que valida a necessidade de reposição de estoque.
No final, você vai exibir, no console, se é necessário a reposição ou não.
*/

public class exercicio01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Carro";
        produto.precoUnitario = 30.000;
        produto.quantidadeEmEstoque = 9;
        eNecessarioReporEstoque(produto);
    }
    static void eNecessarioReporEstoque(Produto produto) {
        System.out.println("A quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidadeEmEstoque + " unidades.");
        if (produto.quantidadeEmEstoque < 10 ) {
            System.out.println("Reponha o produto " + produto.nome + " no estoque.");
        }
    }

}
