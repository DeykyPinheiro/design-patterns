package org.loja.descontos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculoDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }


    @Override
    public Boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
