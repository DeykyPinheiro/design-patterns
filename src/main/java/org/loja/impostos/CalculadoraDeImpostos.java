package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcularImposto(Orcamento orcamento, Imposto tipoImposto) {
        return tipoImposto.calcularTipoDeImposto(orcamento);
    }

}

