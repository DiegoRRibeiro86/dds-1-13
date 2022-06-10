package com.company.mais_detalhes_e_frameworks.Introducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> { // gaveta guarda alguma coisa <E>

    public List<E> colecao = new ArrayList<>();

    public void colocar(E e) {
        colecao.add(e);
    }

    public E retirarPrimeiro() {
        return colecao.get(0);
    }
    }

