package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    protected Imposto impostoAdicional;

    public Imposto(Imposto impostoAdicional) {
        this.impostoAdicional = impostoAdicional;
    }

    public abstract BigDecimal calcularTipoDeImposto(Orcamento orcamento);

    public BigDecimal calcularSomatoriaDeImpostos(Orcamento orcamento) {
        BigDecimal valorImposto = calcularTipoDeImposto(orcamento);
        BigDecimal valorImpostoAdicional = BigDecimal.ZERO;
        if (impostoAdicional != null) {
            valorImpostoAdicional = impostoAdicional.calcularTipoDeImposto(orcamento);
        }
        return valorImposto.add(valorImpostoAdicional);
    }



}
