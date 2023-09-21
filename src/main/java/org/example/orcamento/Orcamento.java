package org.example.orcamento;

import java.awt.font.TextHitInfo;
import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private Integer quantidadeDeItens;

    private String situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = BigDecimal.ZERO;
        if (situacao == "ANALISE") {
            valorDescontoExtra = new BigDecimal("0.05");
        } else if (situacao == "APROVADO") {
            valorDescontoExtra = new BigDecimal("0.02");
        }

        this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao = "APROVADO";
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
