package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
