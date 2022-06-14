package com.company.mais_detalhes_e_frameworks.JOptionPane;

import javax.swing.*;
import java.net.URL;

public class ExemploJOptionPane2 {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
        JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado.", "Atenção!",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Favor informar o CPF!", "Erro",
                JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado!", JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJOptionPane2.class.getResource("Senai.png");
        Icon icone = new ImageIcon(url);

        JOptionPane.showMessageDialog(null, "Obrigado por escolher o Senai.", "Senai", JOptionPane.INFORMATION_MESSAGE, icone);

    }
}
