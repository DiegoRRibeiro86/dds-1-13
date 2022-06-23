package com.company.novidades_do_java_8.api_de_data.exemplos;

import com.company.novidades_do_java_8.api_de_data.modelo.Aluguel;
import com.company.novidades_do_java_8.api_de_data.modelo.Carro;
import com.company.novidades_do_java_8.api_de_data.modelo.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(),0));

        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
        Aluguel aluguel = new Aluguel(cliente,carro,dataEHoraDaRetirada,dataEHoraPrevistaParaDevolucao);

        imprimirRecibo(aluguel);
    }

    private static void imprimirRecibo(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
        System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraRealDaDevolucao().format(formatter));
    }
}
