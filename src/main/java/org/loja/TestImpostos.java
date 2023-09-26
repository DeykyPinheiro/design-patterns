package org.loja;

import org.loja.impostos.CalculadoraDeImpostos;
import org.loja.impostos.ICMS;
import org.loja.impostos.ISS;
import org.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {


    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();


        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ICMS(null)));
        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ISS(null)));

        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ICMS(new ISS(null))));
        System.out.println(calculadoraDeImpostos.calcularImposto(orcamento, new ISS(new ICMS(null))));
    }


}