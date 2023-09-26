package org.loja.descontos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }


    public BigDecimal calcularDesconto(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento)) {
            return efetuarCalculoDesconto(orcamento);
        }
        return proximo.calcularDesconto(orcamento);
    }

    public abstract BigDecimal efetuarCalculoDesconto(Orcamento orcamento);

    public abstract Boolean deveAplicarDesconto(Orcamento orcamento);
}
