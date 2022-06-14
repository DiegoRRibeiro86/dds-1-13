package com.company.mais_detalhes_e_frameworks.JOptionPane;

import javax.swing.*;
import java.io.ObjectInput;

public class ExemploJOptionPane3 {

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes = {"Sim","Não","Sim, com email"};

        int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?",
                "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,opcoes,opcoes[2]);

        System.out.println("Opçãoselecionada: " + opcao);

        if (opcao == 1) {

        }

    }
}
