package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

    @Override
    public void execucarAcao(Pedido pedido) {
        System.out.println("salvando pedido no DB");
    }
}
