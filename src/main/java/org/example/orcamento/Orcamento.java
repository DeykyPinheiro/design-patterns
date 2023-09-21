package org.example.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private Integer quantidadeDeItens;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
