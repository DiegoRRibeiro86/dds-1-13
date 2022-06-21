package com.company.novidades_do_java.try_with_resources_e_multi_catch;

public class SalvarAluno {

    public static void salvar(String nome, String idade) {
        if (nome == null || nome.trim().equals("")) {
            throw new NegocioException("Impossível salvar aluno sem nome!");
        }

        int i = Integer.parseInt(idade);
        System.out.println("Salvando...");
    }

}
