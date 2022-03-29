package com.company;

import java.util.Scanner;

public class EstruturaDecisao11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe  o seu salário: ");
        double salarioInformado = scanner.nextDouble();

        if (salarioInformado <= 280){
            salarioInformado = (salarioInformado * 0.2) + salarioInformado;

            System.out.println("Seu sálário com aumento de 20% é de: " + salarioInformado);

        } else if (salarioInformado > 280 && salarioInformado <= 700){
            salarioInformado = ((salarioInformado * 0.15) + salarioInformado);

            System.out.println("Seu salário com aumento de 15% é de: " + salarioInformado);

        } else if (salarioInformado > 700 && salarioInformado <= 1500){
            salarioInformado = ((salarioInformado * 0.1) + salarioInformado);

            System.out.println("Seu salário com aumento de 10% é de: " + salarioInformado);

        } else if (salarioInformado > 1500){
            salarioInformado = ((salarioInformado * 0.5) + salarioInformado);
            System.out.println("Seu salário com aumento de 5% é de: " + salarioInformado);
        }

        scanner.close();
    }
}
