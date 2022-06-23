package com.company.novidades_do_java_8.api_de_data.exemplos;

import com.company.novidades_do_java_8.api_de_data.modelo.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Diego Rodrigues", LocalDate.of(1986, Month.AUGUST,14));

        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idade >= 18) {
            System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
        } else {
            System.out.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
        }
    }
}
