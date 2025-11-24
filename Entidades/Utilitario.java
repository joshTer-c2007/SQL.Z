package Entidades;

import java.text.DecimalFormat;

public class Utilitario {
    
    public static double redondear(double valor) {
        double factor = Math.pow(10, 2);
        return Math.round(valor * factor) / factor;
    }
    
    public static String redondearAString(double valor) {
        double valorRedondeado = redondear(valor);
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(valorRedondeado);
    }
}

