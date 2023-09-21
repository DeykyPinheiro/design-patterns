package org.example.orcamento.situacao;

import org.example.orcamento.Orcamento;

import javax.swing.plaf.PanelUI;
import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {
    @Override
    public BigDecimal CalcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }
}
