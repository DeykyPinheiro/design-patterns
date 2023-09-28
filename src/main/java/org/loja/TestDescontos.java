package org.loja;

import org.loja.descontos.CalculadoraDeDesconto;
import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {

    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento primeiro = new Orcamento(new BigDecimal("100"));
        Orcamento segundo = new Orcamento(new BigDecimal("200"));
        Orcamento terceiro = new Orcamento(new BigDecimal("1000"));


        System.out.println(calculadoraDeDesconto.calcularDesconto(primeiro));
        System.out.println(calculadoraDeDesconto.calcularDesconto(segundo));
        System.out.println(calculadoraDeDesconto.calcularDesconto(terceiro));

    }
}
