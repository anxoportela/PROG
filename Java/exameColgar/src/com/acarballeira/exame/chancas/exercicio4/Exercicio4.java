/*
 * Documento creado no 2019 por DAWDU1.
 * CIFP A Carballeira. Proxecto exame no 08/12/2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: 8
 */

package com.acarballeira.exame.chancas.exercicio4;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Julio Mosquera González "julio.mosquera@yahoo.es"
 * @version 1.0
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        //Zona de declaración
        String aux;
        
        //Defino a matriz
        String[][] peliculas = 
        {
            {"Top Gun", "Tony Scott", "110", "Tom Cruise", "Val Kilmer", "Kelly McGillis"},
            {"Gladiator", "Ridley Scott", "155", "Russel Crowe", "Joaquim Phoenix", "Connie Nielsen"},
            {"Oblivion", "Joseph Kosinski", "125", "Tom Cruise", "Olga Kurylenko"},
            {"James Bond: El Mañana nunca muere", "Roger Spottiswoode", "119", "Pierce Brosnan", "Teri Hatcher", "Jonathan Pryce", "Michelle Yeoh"}
        };
        
        System.out.printf("### PELICULAS ###%n");
        System.out.printf("%-40s%-20s%-10s%-10s%n", "Película", "Director", "Duración", "Actores");
        System.out.printf("%s%n", "-----------------------------------------------------------------------------");
        for (String[] peli : peliculas) {
            System.out.printf("%-40s%-20s%-10s", peli[0], peli[1], peli[2]);
            for (int i = 3; i < peli.length; i++) {
                aux = peli[i].matches(".*[aeiouAEIOU]$") ? "(*)" : "";
                System.out.printf(i == peli.length - 1 ? "%s" : "%s, ", peli[i] + aux);
            }
            System.out.println();
        } //for
                
    }
}
