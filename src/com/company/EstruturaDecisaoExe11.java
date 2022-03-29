package com.company;

import java.util.Scanner;

public class EstruturaDecisaoExe11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe  o seu salário: ");
        double salarioInformado = scanner.nextDouble();

        System.out.println("Salário antes do reajuste: " + salarioInformado);

        if (salarioInformado <= 280){

            Double salarioAposAumento = (salarioInformado * 0.2) + salarioInformado;
            Double valorDoAumento = salarioInformado * 0.2;

            System.out.println("Percentual de aumeto: 20%. ");
            System.out.println("Valor do aumento: " + valorDoAumento);
            System.out.println("Seu salário com aumento de 20% é de: " + salarioAposAumento);

        } else if (salarioInformado > 280 && salarioInformado <= 700){

            Double salarioAposAumento = ((salarioInformado * 0.15) + salarioInformado);
            Double valorDoAumento = salarioInformado * 0.15;

            System.out.println("Percentual de aumeto: 15%. ");
            System.out.println("Valor do aumento: " + valorDoAumento);
            System.out.println("Seu salário com aumento de 15% é de: " + salarioAposAumento);

        } else if (salarioInformado > 700 && salarioInformado <= 1500){
            Double salarioAposAumento = ((salarioInformado * 0.1) + salarioInformado);
            Double valorDoAumento = salarioInformado * 0.1;

            System.out.println("Percentual de aumeto: 10%. ");
            System.out.println("Valor do aumento: " + valorDoAumento);
            System.out.println("Seu salário com aumento de 10% é de: " + salarioAposAumento);

        } else if (salarioInformado > 1500){
            Double salarioAposAumento = ((salarioInformado * 0.5) + salarioInformado);
            Double valorDoAumento = salarioInformado * 0.5;

            System.out.println("Percentual de aumeto: 5%. ");
            System.out.println("Valor do aumento: " + valorDoAumento);
            System.out.println("Seu salário com aumento de 5% é de: " + salarioAposAumento);
        }

        scanner.close();
    }
}
