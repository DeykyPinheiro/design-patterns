package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    @Override
    public void execucarAcao(Pedido pedido){
        System.out.println("enviado pedido do cliente: " + pedido.getCliente());
    }
}
