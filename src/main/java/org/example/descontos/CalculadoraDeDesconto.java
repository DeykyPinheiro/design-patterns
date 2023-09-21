package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

            return BigDecimal.ZERO;
    }
}
