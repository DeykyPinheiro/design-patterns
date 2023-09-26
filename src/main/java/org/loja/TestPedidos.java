package org.loja;

import org.loja.pedido.GerarPedido;
import org.loja.pedido.acao.EnviarEmailPedido;
import org.loja.pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
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
