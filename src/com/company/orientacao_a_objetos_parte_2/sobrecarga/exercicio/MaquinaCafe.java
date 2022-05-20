package com.company.orientacao_a_objetos_parte_2.sobrecarga.exercicio;

import java.util.Scanner;

public class MaquinaCafe {
    public int acucarDisponivel;
    int quantidadeAcucar;

    public void fazerCafe(){
        fazerCafe(10);
    }
    public void fazerCafe(int quantidadeAcucar){
        if (acucarDisponivel < quantidadeAcucar) {
            System.out.println("Não há açucar suficiente para fazer café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo o café com " + quantidadeAcucar + " gramas de açucar.");
        }
    }

    public int getAcucarDisponivel() {
        return acucarDisponivel;
    }

    public void setAcucarDisponivel(int acucarDisponivel) {
        this.acucarDisponivel = acucarDisponivel;
    }
}
