package com.algoworks.algafood.algafood.modelo;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valorProduto;

    public Produto(String nome, BigDecimal valorProduto) {
        super();
        this.nome = nome;
        this.valorProduto = valorProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }
}
