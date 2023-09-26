package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSComISS implements Imposto {

    @Override
    public BigDecimal calcularTipoDeImposto(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calcularTipoDeImposto(orcamento);
        BigDecimal iss = new ISS().calcularTipoDeImposto(orcamento);
        return icms.add(iss);
    }
}
