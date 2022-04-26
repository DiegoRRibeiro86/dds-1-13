package com.company.Metodos;
/*
Exibir uma tabuada de um número qualquer
Crie um programa que aumente o número de qualquer usuário e imprima a tabuada desse número, do 0 até o 10. Por exemplo,
a tabuada do número dois ficaria assim:
2 x 0 = 0
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
Para fazer esse trabalho você deve usar a técnica da recursividade. Crie um método com o nome de "imprimirTabuada" que
recebe dois parâmetros - o multiplicando eo multiplicador. O multiplicando será o número que o usuário digitou eo
multiplicador será o número que irá ser incrementado a cada operação de multiplicação.
Dentro do método "imprimirTabuada" você deve multiplicar um parâmetro pelo outro, mostrando para o usuário a multiplicação
não feita com final o resultado, e incrementar o multiplicador e fazer uma chamada método
  "imprimirTabuada" com o multiplicador já incrementado.
Obviamente, a primeira chamada, ao método "imprimirTabuada", será feita a partir do método "main". O parâmetro
ao multiplicar você terá referência pois, será o usuário que irá digitar pelo console, o multiplicador você pode
iniciar, na primeira chamada, com o número zero estaticamente. O método "imprimirTabuada" é que fará o trabalho de
incrementá-lo para as próximas chamadas que foram feitas.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** CALCULAR TABUADA ******");
        System.out.print("Digite um número para saber sua tabuada: ");
        Integer numero = scanner.nextInt();
        imprimirTabuada(numero, 0);

    }

    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }
}