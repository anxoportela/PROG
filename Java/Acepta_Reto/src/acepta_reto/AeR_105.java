/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author anxo
 */
import java.util.Scanner;

public class AeR_105 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);
        double min, max, cajaDia, promedio;
        int diaMin, diaMax;
        String domingo, diaMenos, diaMas;

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        cajaDia = entrada.nextDouble();
        diaMax = 0;
        diaMin = 0;
        promedio = 0;
        domingo = "";
        diaMenos = "";
        diaMas = "";
        
        while (cajaDia > 0) {

            for (int i = 1; i <= 6; i++) {
                if (cajaDia <= min) {
                    diaMin = i;
                    min = cajaDia;
                } else if (cajaDia >= max) {
                    diaMax = i;
                    max = cajaDia;
                }
                
                if (i<6){
                 promedio+=cajaDia;   
                } else {
                    promedio+=cajaDia;
                    promedio/=6;
                    
                    if (cajaDia>promedio){
                        domingo = "SI";
                    } else {
                        domingo = "NO";
                    }
                }
            cajaDia = entrada.nextDouble();
            }
            
            switch (diaMin){
                case 1:
                    diaMenos = "MARTES";
                    break;
                case 2:
                    diaMenos = "MIERCOLES";
                    break;
                case 3:
                    diaMenos = "JUEVES";
                    break;
                case 4:
                    diaMenos = "VIERNES";
                    break;
                case 5:
                    diaMenos = "SABADO";
                    break;
                case 6:
                    diaMenos = "DOMINGO";
                    break;
            }
            
                        switch (diaMax){
                case 1:
                    diaMas = "MARTES";
                    break;
                case 2:
                    diaMas = "MIERCOLES";
                    break;
                case 3:
                    diaMas = "JUEVES";
                    break;
                case 4:
                    diaMas = "VIERNES";
                    break;
                case 5:
                    diaMas = "SABADO";
                    break;
                case 6:
                    diaMas = "DOMINGO";
                    break;
            }
            
            System.out.println(diaMas + " " + diaMenos + " " + domingo);
            
            
        }

    }
}
