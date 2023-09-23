package org.example.pedido;

import org.example.orcamento.Orcamento;
import org.example.pedido.acao.AcaoAposGerarPedido;

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

        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(this.cliente, data, orcamento);

        acoes.forEach(a -> a.execucarAcao(pedido));
    }
}
