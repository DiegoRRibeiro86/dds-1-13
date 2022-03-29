package com.company;

import java.util.Scanner;

public class EstruturaDecisaoExe12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da cada hora trabalhada: ");
        Double valorDaHoraTrabalhada = scanner.nextDouble();
        System.out.print("Informe quantas horas você trabalhou no mês: ");
        Double horasTrabalhadasNoMes = scanner.nextDouble();

        Double salarioBruto = valorDaHoraTrabalhada * horasTrabalhadasNoMes;
        Double impostoDeRenda1 = salarioBruto * 0.05;
        Double impostoDeRenda2 = salarioBruto * 0.1;
        Double impostoDeRenda3 = salarioBruto * 0.2;
        Double descontoInss = salarioBruto * 0.1;
        Double descontoFgts = salarioBruto * 0.11;
        Double totalDeDescontos1 = impostoDeRenda1 + descontoInss;
        Double totalDeDescontos2 = impostoDeRenda2 + descontoInss;
        Double totalDeDescontos3 = impostoDeRenda3 + descontoInss;
        Double salarioLiquido = salarioBruto - totalDeDescontos1;
        Double salarioLiquidoSemIr = salarioBruto - descontoInss;

        if (salarioBruto <= 900) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: Isento.");
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos1);
            System.out.println("Salário líquido: " + salarioLiquidoSemIr);

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRenda1);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos1);
            System.out.println("Salário líquido: " + salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRenda2);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos2);
            System.out.println("Salário líquido: " + salarioLiquido);
        } else if (salarioBruto > 2500) {
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Imposto de renda: " + impostoDeRenda3);
            System.out.println("Desconto INSS: " + descontoInss);
            System.out.println("Desconto FGTS: " + descontoFgts);
            System.out.println("Total de descontos: " + totalDeDescontos3);
            System.out.println("Salário líquido: " + salarioLiquido);
        }
        scanner.close();
    }
}
