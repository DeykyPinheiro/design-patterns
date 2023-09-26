package org.loja.orcamento;

import org.loja.orcamento.situacao.EmAnalise;
import org.loja.orcamento.situacao.Finalizado;
import org.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private Integer quantidadeDeItens;

    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = situacao.CalcularValorDescontoExtra(this);
        this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }


    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
