package com.company.orientacao_a_objetos_parte_2.enumeracoes;
public enum OperacoesAritmeticas {
    ADICAO {
        public int operacao (int x, int y) {        // métodos de operação do enum.
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao( int x, int y) {
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);

}
