package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }
    

    @Override
    public BigDecimal efetuarCalculoDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
}
