package org.example;

import org.example.impostos.CalculadoraDeImpostos;
import org.example.impostos.ICMS;
import org.example.impostos.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {


    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();


        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ISS()));

    }


}