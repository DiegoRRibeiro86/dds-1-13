package com.company.programacao_orientada_a_objetos.encapsulamento;

public class Pedido {

    String codigo;
    Double subtotal;
    Double desconto;
 //   String total;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return getSubtotal() - getDesconto();
    }

 //   public void setTotal(String total) {
 //       this.total = total;
    }

