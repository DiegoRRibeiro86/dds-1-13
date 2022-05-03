package com.company.programacao_orientada_a_objetos.encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Diego Rodrigues");
        cliente.setTelefone("27998415076");
        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("ùltimo nome: " + cliente.getUltimoNome());

    }
}
