package com.company;

/*
* Crie um programa que vai receber as notas que uma pessoa tirou nas duas matérias de sua prova.
* Serão dois parêmetros para receber, um para receber a nota de português e outro para receber a nota de matemática.

* A prova no total vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
* Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
* se tirar 59 em português e 100 em natemática (totalizando uma nota maior do que o total necessário que é 150)
* ele não conseguirá a vaga.

* No final mostre para o candidato se ele conseguiu ou não.
* */

import java.util.Scanner;

public class Exercicio01_16032022 {

    static final Integer NOTA_MINIMA_EM_PORTUGUES_PARA_SER_APROVADO = 60;
    static final Integer NOTA_MINIMA_EM_MATEMATICA_PARA_SER_APROVADO = 60;
    static final Integer NOTA_MINIMA_TOTAL_PARA_PASSAR = 150;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota que você tirou em lingua portuguesa: ");
        Double notaEmPortugues = scanner.nextDouble();
        System.out.print("Digite a nota que você tirou em matemática: ");
        Double notaEmMatematica = scanner.nextDouble();

        Boolean notaMinimaParaPassar = obterNotaMinimaParaPassar(notaEmPortugues, notaEmMatematica) >= NOTA_MINIMA_TOTAL_PARA_PASSAR;
        Boolean notaMinimaEmPortugues = notaEmPortugues >= NOTA_MINIMA_EM_PORTUGUES_PARA_SER_APROVADO;
        Boolean notaMinimaEmMatematica = notaEmMatematica >= NOTA_MINIMA_EM_MATEMATICA_PARA_SER_APROVADO;
        Double somaDasNotas = obterNotaMinimaParaPassar(notaEmPortugues, notaEmMatematica);

        if (notaEmPortugues >= 60 && notaEmMatematica >= 60 && notaMinimaParaPassar){
            System.out.println("\nVocê foi aprovado com " + somaDasNotas + " pontos.");
        } else {
            System.out.println("\nVocê foi reprovado.");
        }
        scanner.close();
    }

    private static double obterNotaMinimaParaPassar(Double notaEmPortugues, Double notaEmMatematica) {
        return notaEmPortugues + notaEmMatematica;
    }
}
