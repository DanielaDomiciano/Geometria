package br.edu.femass.teste;

import br.edu.femass.model.Ponto;
import br.edu.femass.model.SegmentoReta;

public class SegmentoRetaTest {

    public static void main(String[] args){

        SegmentoReta r1 = new SegmentoReta(
                0.0,
                0.0,
                1.0,
                2.0);

        //System.out.println(r1.getTamanho());
        //System.out.println(r1.getP1().getLocalizacao());
        //System.out.println(r1.getP2().getLocalizacao());
        //System.out.println(r1.getP1().toString());
        //System.out.println(r1.getP2().toString());

        SegmentoReta r2 = new SegmentoReta(
                new Ponto(),
                new Ponto(1.0, 2.0)
        );

        //System.out.println(r2.getTamanho());
        //System.out.println(r2.getP1().getLocalizacao());
        //System.out.println(r2.getP2().getLocalizacao());

        System.out.println(r1.equals(r2));

    }
}


