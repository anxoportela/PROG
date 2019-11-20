/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_10_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_10_Anxo_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] ciudades = {
            {"Portugal", "Lisboa", "Porto", "Setúbal"},
            {"España", "Madrid", "Barcelona", "Sevilla"},
            {"Francia", "París", "Niza", "Lyon"},
            {"Italia", "Roma", "Nápoles", "Sicilia"}};

        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Pais: " + ciudades[i][0] + "\t Ciudades: ");
            for (int j = 1; j < ciudades[i].length; j++) {
                System.out.print(ciudades[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
