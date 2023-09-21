package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComItensMaiorQueCinco extends Desconto {

    public DescontoParaOrcamentoComItensMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcularDesconto(orcamento);
    }
}
