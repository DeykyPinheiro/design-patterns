package org.example.descontos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        Desconto ListaDescontos = new DescontoParaOrcamentoComItensMaiorQueCinco(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return ListaDescontos.calcularDesconto(orcamento);
    }
}
