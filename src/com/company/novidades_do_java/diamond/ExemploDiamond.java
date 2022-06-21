package com.company.novidades_do_java.diamond;

import java.util.*;

public class ExemploDiamond {
    public static void main(String[] args) {
        List<String> nomeClientes = new ArrayList<>();
        nomeClientes.add("João");
        nomeClientes.add("Marie");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");

        /*  Set<String> carrosDaVolks = n;
        carrosDaVolks.put("Volks", carrosDaVolks = new HashSet<>());
        carrosDaVolks.get("Volks").add("Gol");
        */

    }
}
