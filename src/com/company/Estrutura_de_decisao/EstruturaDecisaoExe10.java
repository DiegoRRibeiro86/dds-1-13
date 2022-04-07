/*
* Faça um programa que pergunte em que turno você estuda.
* Peça para digitar M - Matutino ou V - Vespertino ou N - Noturno.
* Imprima a mensagem: "Bom dia!", "Boa tarde!" ou "Boa noite!"
*
* */

package com.company.Estrutura_de_decisao;

import java.util.Scanner;

public class EstruturaDecisaoExe10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Em qual turno você estuda? [M] Matutino | [V] Vespertino | [N] Noturno : ");
        Character escolhaTurno = scanner.next().charAt(0);

        if (escolhaTurno == 'M' || escolhaTurno == 'm'){
            System.out.println("Bom dia!");
        } else if (escolhaTurno == 'V' || escolhaTurno == 'v'){
            System.out.println("Boa tarde!");
        } else if (escolhaTurno == 'N' || escolhaTurno == 'n'){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido.");
        }

        scanner.close();
    }
}






