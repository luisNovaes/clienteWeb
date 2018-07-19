/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.servico;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import ws.CalculoBasico;
import ws.CalculoBasicoService;
import ws.Resultado;

/**
 *
 * @author luis.silva
 */
public class UsaCalculo {

    public static void main(String[] args) throws Exception {
        CalculoBasicoService cb = new CalculoBasicoService(
                new URL("http://localhost:8080/WebApplicationJAX-WS/CalculoBasicoService?wsdl"),
                new QName("http://ws.aplicacao.com/", "CalculoBasicoService"));
        CalculoBasico port = cb.getCalculoBasicoPort();
        System.out.println(port.somar(100, 900));

        Resultado r = port.somarEx(10, 35);
        System.out.println(r.getTexto() + " = " + r.getValor());

        List<Resultado> rs = port.somarVarios(1, 2, 7);
        for (Resultado rr : rs) {
            System.out.println(rr.getTexto() + " = " + rr.getValor());
        }
        rs = port.somarVariosEx(1, 2, 7);
        for (Resultado rr : rs) {
            System.out.println(rr.getTexto() + "= " + rr.getValor());
        }

        Resultado param = new Resultado();
        param.setValor(500);
        System.out.println("Objeto: " + port.somarObjeto(param, 10));

        List lista = new ArrayList<>();
        lista.add(param);
        lista.add(param);
        System.out.println("Lista: " + port.somarObjetos(lista));
    }
}
