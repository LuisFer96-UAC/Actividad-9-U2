/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author harde
 */
public class Verificador {
    public boolean verificador(int a){
        return a <=0;
    }
    public String tartamudo(String frase){
        String stut = "" + frase.charAt(0)+ frase.charAt(1)+ ".. ";
        
        return stut + stut+ frase + "?";
    }
    public int totalTheReca(int tazas){
     int tazasGratis = tazas / 6;
     return tazas + tazasGratis;
    }
    public int recuento(String oracion){
        return oracion.split("\\s+|\\n|,").length;
    }
}
