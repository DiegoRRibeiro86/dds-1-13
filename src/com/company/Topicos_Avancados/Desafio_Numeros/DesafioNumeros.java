package com.company.Topicos_Avancados.Desafio_Numeros;

import com.sun.deploy.security.ruleset.RuleSetParser;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Desenvolva um programa que:
Recebe como parâmetro do usuário o valor de um produto do tipo double.
Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
Formata o novo valor calculado para o padrão monetário (R$).
Exibe na tela o valor calculado e formatado.
 */
public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        System.out.print("Informe o valor do produto: ");
        double valorProduto = entrada.nextDouble();

        BigDecimal valorBig = new BigDecimal(valorProduto);
        BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));

        String valorFormatado = formatador.format(resultado.doubleValue());
        System.out.println("10% do valor é: " + valorFormatado);
    }

}

