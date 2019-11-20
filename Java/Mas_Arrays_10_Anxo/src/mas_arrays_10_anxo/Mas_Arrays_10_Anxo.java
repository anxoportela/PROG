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
public class Mas_Arrays_10_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] paises = {"Portugal", "España", "Francia", "Italia"};
        String[][] ciudades = {
            {"Lisboa", "Porto", "Setúbal"},
            {"Madrid", "Barcelona", "Sevilla"},
            {"París", "Niza", "Lyon"},
            {"Roma", "Nápoles", "Sicilia"}};

        for (int i = 0; i < paises.length; i++) {
            System.out.print("Pais: " + paises[i] + "\t Ciudades: ");
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print(ciudades[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
