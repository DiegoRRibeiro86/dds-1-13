package com.company.programacao_orientada_a_objetos.encapsulamento;
/*
Exibindo os dados de um pedido
Crie um programa que vai, simplesmente, mostrar os dados de um pedido de vendas no console.
O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido. Essa classe terá 4 atributos:
código, subtotal, desconto e total.
Nenhum método principal do programa você criará uma variável que poderá chamar de pedido, do tipo Pedido e instanciar ela.
Coloque os valores de cada atributo, do pedido variável, como achar melhor.
Feito isso, mais todas essas propriedades no console. Não esqueça de encapsular cada propriedade antes de exibir os
dados sem console. Isso é para que você não use como variáveis diretamente e sim os métodos getters e setters.
Depois desta primeira etapa, você fará o seguinte... Remova a propriedade total da classe Pedido.
Vai dar um erro nos métodos getTotal e setTotal. Nenhum método getTotal mude uma implementação de forma que o retorno dele seja
seja uma subtração da propriedade subtotal pela propriedade desconto.
O método configurado você pode, simplesmente, não deixar-se-lo vazio, pois será útil. Em um caso real, ele seria removido
de todo o programa aos poucos e sem necessidade de urgência.
PS: O exercício é feito em dois passos para que você faça o encapsulamento.
*/
public class Exercicio03 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.setCodigo("01234");
        pedido.setSubtotal(25.000);
        pedido.setDesconto(2.500);
      //  pedido.setTotal(22.500);
        System.out.println("Código: " + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("Total: " + pedido.getTotal());

        System.out.println("Totoal: " + pedido.getTotal());
    }
}
