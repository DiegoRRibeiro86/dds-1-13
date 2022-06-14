package com.company.mais_detalhes_e_frameworks.JOptionPane;

import javax.swing.*;

public class ExemploJOptionPane4 {

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilidades = {"Masculino", "Feminino"};

        String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "SENAI",
                JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);

        System.out.println("Sexo selecionado: " + sexo);

        String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "SENAI", JOptionPane.PLAIN_MESSAGE, null, null, null);

        System.out.println("Seu nome é: " + nome);

        }
    }
