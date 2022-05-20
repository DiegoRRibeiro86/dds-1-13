package com.company.orientacao_a_objetos_parte_2.polimorfismo_casting_de_objetos;

public class TestePolimorfismo {                /// Quarto...
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.getSaldo(4000);
        TestePolimorfismo.imprimirSaldoConta(conta);
        //------------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldoConta(contaCorrente);
        System.out.println();
        //------------------------------------------
        Conta contaPoupanca = new Contapoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldoConta(contaPoupanca);
    }

    private static void imprimirSaldoConta(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo(4000));
        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }
        if (conta instanceof ContaCorrente) {
            Contapoupanca cp = (Contapoupanca) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }
}
