package org.example.orcamento.situacao;

import org.example.exception.BusinessException;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal CalcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new BusinessException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new BusinessException("Orcamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new BusinessException("Orcamento não pode ser finalizado");
    }


}
