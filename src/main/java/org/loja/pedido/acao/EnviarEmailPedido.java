package org.loja.pedido.acao;

import org.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    @Override
    public void execucarAcao(Pedido pedido){
        System.out.println("enviado pedido do cliente: " + pedido.getCliente());
    }
}
