package org.example.impostos;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcularTipoDeImposto(Orcamento orcamento);
}
