package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto impostoAdicional) {
        super(impostoAdicional);
    }

    @Override
    public BigDecimal calcularTipoDeImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.06));
    }
}
