/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_11_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_11_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] equipos = {
            {"Barça", "Movistar", "ElPozo", "Osasuna"},
            {"Barcelona", "Madrid", "Murcia", "Osasuna"},
            {"E1", "E2", "E3", "E4"}};

        for (int i = 0; i < equipos.length; i++) {
            System.out.print("Equipo: " + equipos[0][i] + "\tCiudad: ");
            for (int j = 1; j < equipos.length; j++) {
                if (j < 2) {
                    System.out.print(equipos[j][i] + "\tEstadio: ");
                } else {
                    System.out.print(equipos[j][i]);
                }
            }
            System.out.println("");
        }
    }
}