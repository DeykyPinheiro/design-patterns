package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto impostoAdicional) {
        super(impostoAdicional);
    }

    @Override
    public BigDecimal calcularTipoDeImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }
}
