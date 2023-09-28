package org.loja.pedido;

import org.loja.orcamento.ItemOrcamento;
import org.loja.orcamento.Orcamento;
import org.loja.pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GerarPedido {

    private String cliente;


    private BigDecimal valorOrcamento;

    int quantidadeItens;

    private List<AcaoAposGerarPedido> acoes;

    public void setAcoes(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void geraPedido() {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(this.valorOrcamento));
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(this.cliente, data, orcamento);

        acoes.forEach(a -> a.execucarAcao(pedido));
    }
}
