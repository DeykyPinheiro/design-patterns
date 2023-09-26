package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcularTipoDeImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(0.06));
    }
}
