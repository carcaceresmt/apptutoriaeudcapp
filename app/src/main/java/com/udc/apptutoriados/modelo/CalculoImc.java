package com.udc.apptutoriados.modelo;

import java.text.DecimalFormat;

public class CalculoImc {

    private double peso;
    private double altura;

    public CalculoImc(String peso,String altura){
         this.peso=Double.valueOf(peso);
         this.altura=Double.valueOf(altura);
    }
    private double calculoIMC(){
        return peso/Math.pow((altura/100),2);
    }
    public String salidaIMC(){
        DecimalFormat format=new DecimalFormat(("####.##"));
        return "IMC:"+format.format(calculoIMC());
    }

}
