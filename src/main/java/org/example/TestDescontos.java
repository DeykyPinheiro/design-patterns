package org.example;

import org.example.descontos.CalculadoraDeDesconto;
import org.example.impostos.CalculadoraDeImpostos;
import org.example.impostos.ICMS;
import org.example.impostos.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {

    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println("valor desconto: " +calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("100"), 6)));
        System.out.println("valor desconto: " +calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("100"), 4)));

        System.out.println("valor desconto: " +calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("1000"), 1)));

    }
}
