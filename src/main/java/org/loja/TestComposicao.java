package org.loja;

import org.loja.orcamento.ItemOrcamento;
import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestComposicao {

    public static void main(String[] args) {
        Orcamento antigoOrcamento = new Orcamento();
        antigoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal(200)));
        antigoOrcamento.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
        orcamentoNovo.adicionarItem(antigoOrcamento);

        System.out.println(orcamentoNovo.getValor());
    }

}
