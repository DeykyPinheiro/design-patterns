package org.loja.orcamento;

import org.loja.orcamento.situacao.EmAnalise;
import org.loja.orcamento.situacao.Finalizado;
import org.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;

    private SituacaoOrcamento situacao;

    private List<ItemOrcamento> itens = new ArrayList<>();

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = situacao.CalcularValorDescontoExtra(this);
        this.valor.subtract(valorDescontoExtra);
    }

    public void adicionarItem(ItemOrcamento item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
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

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeDeItens() {
        return this.itens.size();
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
