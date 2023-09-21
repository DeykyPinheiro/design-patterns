package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComItensMaiorQueCinco extends Desconto {

    public DescontoParaOrcamentoComItensMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculoDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }
}
