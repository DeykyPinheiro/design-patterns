package org.loja;

import org.loja.descontos.CalculadoraDeDesconto;
import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {

    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento a = new Orcamento(new BigDecimal("200"), 6);
        Orcamento b = new Orcamento(new BigDecimal("100"), 4);
        Orcamento c = new Orcamento(new BigDecimal("1000"), 1);


//        System.out.println("valor desconto: " + calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("100"), 6)));
//        System.out.println("valor desconto: " + calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("100"), 4)));
//        System.out.println("valor desconto: " + calculadoraDeDesconto.calcularDesconto(new Orcamento(new BigDecimal("1000"), 1)));

        System.out.println(calculadoraDeDesconto.calcularDesconto(a));
        System.out.println(calculadoraDeDesconto.calcularDesconto(b));
        System.out.println(calculadoraDeDesconto.calcularDesconto(c));

    }
}
