package org.example;

import org.example.orcamento.Orcamento;
import org.example.pedido.Pedido;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestPedidos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String clienteA = "ana silva";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(clienteA, data, orcamento);


        System.out.println("salvar pedido em banco de dados");
        System.out.println("enviar e-mail com pedido");

    }






}
