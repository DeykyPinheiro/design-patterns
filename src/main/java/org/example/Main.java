package org.example;

import org.example.impostos.CalculadoraDeImpostos;
import org.example.impostos.ICMS;
import org.example.impostos.ISS;
import org.example.impostos.Imposto;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
//        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ILUSTRAR));
    }


}