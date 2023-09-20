package org.example;

import org.example.impostos.CalculadoraDeImpostos;
import org.example.impostos.TipoImposto;
import org.example.orcamento.Orcamento;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ILUSTRAR));
    }



}