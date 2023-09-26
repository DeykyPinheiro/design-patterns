package org.loja.pedido.acao;

import org.loja.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

    @Override
    public void execucarAcao(Pedido pedido) {
        System.out.println("salvando pedido no DB");
    }
}
