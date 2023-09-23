package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class EnviarEmailPedido {

    public void enviarEmail(Pedido pedido){
        System.out.println("enviado pedido do cliente: " + pedido.getCliente());
    }
}
