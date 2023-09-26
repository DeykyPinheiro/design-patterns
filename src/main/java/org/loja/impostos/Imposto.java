package org.loja.impostos;

import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcularTipoDeImposto(Orcamento orcamento);
}
