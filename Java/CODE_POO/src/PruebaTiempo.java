/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */

public class PruebaTiempo {
    
        public static void main(String[] args) {
        tiempo tiempo = new tiempo();
        String salida;

        salida = "Hora universal inicial es: " + tiempo.horaUniversal() + "\nHora estandar inicial es: " + tiempo.horaEstandar();
        tiempo.cambiarHora(13, 27, 6);
        salida += "\n\nHora universal despues de cambiada: " + tiempo.horaUniversal() + "\nHora estandar despues de cambiada: " + tiempo.horaEstandar();
        tiempo.cambiarHora(99, 99, 99);
        salida += "\n\nDespues de poner valores invalidos: " + "\nHora universal: " + tiempo.horaUniversal() + "\nHora estandar: " + tiempo.horaEstandar();
        
        System.out.println(salida);
    }

}
