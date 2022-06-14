package com.company.mais_detalhes_e_frameworks.JOptionPane;

import javax.swing.*;

public class ExemploJOptionPane1 {

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
    }
}
