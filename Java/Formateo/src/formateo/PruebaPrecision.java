/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formateo;

/**
 *
 * @author dual108
 */
public class PruebaPrecision {
    
    public static void main(String[] args) {
        double f = 123.94536;
        String s = "Feliz Cumpleanios";
        
        System.out.printf("Uso de la precision para numeros de punto flotante\n");
        System.out.printf("\t%.3f\n\t%.3e\n\t%.3g\n\n", f, f, f);
        
        System.out.printf("Uso de la precision de las cadenas\n");
        System.out.printf("\t%.11s\n", s);
    }
}
