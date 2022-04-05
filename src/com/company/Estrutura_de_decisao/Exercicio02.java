package com.company.Estrutura_de_decisao;

/*Pense em uma empresa fictícia que todo mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.

Crie um programa que receba 3 valores. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois receba o parâmetro referente ao faturamento real da empresa no último ano. Por último, receba a média salarial
do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).

Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
ganharão um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.

No final, mostre de quanto será o prêmio desse funcionário(a).
* */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor referente a meta de faturamento anual do ano passado: ");
        Double metaDeFaturamentoAnual = scanner.nextDouble();
        System.out.print("Digite o valor do faturamento real no último ano: ");
        Double faturamentoRealAnual = scanner.nextDouble();
        System.out.print("Digite a sua média salarial no último ano: ");
        Double mediaSalarialAnual = scanner.nextDouble();

        Double bonus = mediaSalarialAnual + mediaSalarialAnual;
        Double oitentaPorcentoDoSalario = 0.8 * mediaSalarialAnual;
        Double oitentaPorcentoDoValorDaMeta = 0.8 * metaDeFaturamentoAnual;
        Double bonus80Porcento =  oitentaPorcentoDoSalario + mediaSalarialAnual;
        Boolean faturoupeloMenos80PorCento = faturamentoRealAnual < metaDeFaturamentoAnual ||
                faturamentoRealAnual >= oitentaPorcentoDoValorDaMeta;
        Boolean ganhouBonus = faturamentoRealAnual >= metaDeFaturamentoAnual;

        if (ganhouBonus){
            System.out.println("Você ganhará um bônus equivalente a: " + bonus + ".");
        } else if (faturoupeloMenos80PorCento){
            System.out.println("Você receberá um bônus de 80% equivalente a: " + bonus80Porcento);
        }

        scanner.close();

    }
}
