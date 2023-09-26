package org.loja.orcamento.situacao;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public BigDecimal CalcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
