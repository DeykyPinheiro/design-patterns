package org.example.pedido;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {

    private String cliente;


    private BigDecimal valorOrcamento;

    int quantidadeItens;

    public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void geraPedido() {

        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(this.cliente, data, orcamento);


        System.out.println("salvar pedido em banco de dados");
        System.out.println("enviar e-mail com pedido");

    }
}
