package org.example;

import org.example.orcamento.Orcamento;
import org.example.pedido.GerarPedido;
import org.example.pedido.Pedido;
import org.example.pedido.acao.EnviarEmailPedido;
import org.example.pedido.acao.SalvarPedidoNoBanco;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPedidos {

    public static void main(String[] args) {
        String cliente = "cliente teste";
        BigDecimal valorOrcamento = new BigDecimal("3000");
        int quantidadeDeItens = 4;

        GerarPedido geraradorPedido = new GerarPedido(cliente, valorOrcamento, quantidadeDeItens);
        geraradorPedido.setAcoes(Arrays.asList(new SalvarPedidoNoBanco(), new EnviarEmailPedido()));
        geraradorPedido.geraPedido();
    }


}
