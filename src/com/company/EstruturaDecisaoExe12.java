package com.company;

import java.util.Scanner;

public class EstruturaDecisaoExe12 {

    static final Integer SALARIO_BRUTO_900 = 900;
    static final Integer SALARIO_BRUTO_1500 = 1500;
    static final Integer SALARIO_BRUTO_2500 = 2500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da cada hora trabalhada: ");
        Double valorDaHoraTrabalhada = scanner.nextDouble();
        System.out.print("Informe quantas horas você trabalhou no mês: ");
        Double horasTrabalhadasNoMes = scanner.nextDouble();

        Double salarioBruto = valorDaHoraTrabalhada * horasTrabalhadasNoMes;
        Double impostoDeRendaDeCincoPorCento = salarioBruto * 0.05;
        Double impostoDeRendaDeDezPorCento = salarioBruto * 0.1;
        Double impostoDeRendaDeVintePorCento = salarioBruto * 0.2;
        Double descontoInss = salarioBruto * 0.1;
        Double descontoFgts = salarioBruto * 0.11;
        Double totalDeDescontos1 = impostoDeRendaDeCincoPorCento + descontoInss;
        Double totalDeDescontos2 = impostoDeRendaDeDezPorCento + descontoInss;
        Double totalDeDescontos3 = impostoDeRendaDeVintePorCento + descontoInss;
        Double salarioLiquido = salarioBruto - totalDeDescontos1;
        Double salarioLiquidoSemIr = salarioBruto - descontoInss;

        if (salarioBrutoMenorOuIgualA900(salarioBruto)) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: Isento.");
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos1);
            System.out.println("Salário líquido: " + salarioLiquidoSemIr);

        } else if (salarioBrutoMaiorQue900EMenorOuIgualA1500(salarioBruto)) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRendaDeCincoPorCento);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos1);
            System.out.println("Salário líquido: " + salarioLiquido);

        } else if (salarioBrutoMaiorQue1500EMenorOuIgualA2500(salarioBruto)) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRendaDeDezPorCento);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos2);
            System.out.println("Salário líquido: " + salarioLiquido);

        } else if (salarioBrutoMaiorQue2500(salarioBruto)) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRendaDeVintePorCento);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos3);
            System.out.println("Salário líquido: " + salarioLiquido);
        }

        scanner.close();
    }
        private static boolean salarioBrutoMenorOuIgualA900 (double salarioBruto){
        return salarioBruto <= SALARIO_BRUTO_900;
        }
        private static boolean salarioBrutoMaiorQue900EMenorOuIgualA1500 (double salarioBruto){
        return salarioBruto > SALARIO_BRUTO_900 && salarioBruto <= SALARIO_BRUTO_1500;
        }
        private static boolean salarioBrutoMaiorQue1500EMenorOuIgualA2500 (double salarioBruto){
        return salarioBruto > SALARIO_BRUTO_1500 && salarioBruto <= SALARIO_BRUTO_2500;
        }
        private static boolean salarioBrutoMaiorQue2500 (double salarioBruto){
        return salarioBruto > SALARIO_BRUTO_2500;
        }
}
