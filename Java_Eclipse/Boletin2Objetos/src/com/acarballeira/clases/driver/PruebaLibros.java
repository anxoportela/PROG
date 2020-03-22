package com.acarballeira.clases.driver;

import java.util.Scanner;

import com.acarballeira.clases.ejercicio6.*;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class PruebaLibros {
	
	private static final int MAX_LIBROS = 10;
	private static Libro[] biblioteca;
	protected static final byte INCREMENTO_CODIGO=5;
	
	
	
	public static void main(String[] args) {
		
		biblioteca = new Libro[MAX_LIBROS];
        int opcion;
        int contador = 0;
        int contadorCodigo = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                contadorCodigo += INCREMENTO_CODIGO;
                nuevoLibro(biblioteca, MAX_LIBROS, contador, contadorCodigo);
                contador++;
                break;
            case 3:
                System.out.print("Introduzca el código del libro a editar: ");
                editarLibro(sc.nextInt());
                break;
            case 4:
                System.out.print("Introduzca el código del libro a borrar: ");
                borrarLibro(sc.nextInt());
                break;
            default:
                break;
            }
            
        } while ( opcion != 5 );
        
        sc.close();

    }
	
	public static void listar( Libro[] biblioteca ) {
		  
        System.out.println("\nLISTADO\n========");
        for( Libro x : biblioteca ) {
           System.out.println(x);
        }
       
    }
	
	public static void nuevoLibro(Libro[] biblioteca, int MAX_LIBROS, int contador, int contadorCodigo) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nLIBRO NUEVO\n===========\nIntroduzca los datos del libro.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páginas: ");
            int numPax = sc.nextInt();
            
            biblioteca[contador] = new Libro(titulo, autor, numPax, editorial, contadorCodigo);
            
    }
	
	public static void editarLibro(int codigo) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i].getCodigo() == codigo ) {
                System.out.print("\nEDITAR LIBRO\n===========\nIntroduzca los datos del libro.\nTítulo: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Editorial: ");
                String editorial = sc.nextLine();
                System.out.print("Número de páginas: ");
                int numPax = sc.nextInt();
                if (!titulo.equals("")) {
                    biblioteca[i].setTitulo(titulo);
                }
                if (!autor.equals("")) {
                    biblioteca[i].setAutor(autor);
                }
                if (!editorial.equals("")) {
                    biblioteca[i].setEditorial(editorial);
                }
                if (numPax != 0) {
                    biblioteca[i].setNumPaginas(numPax);
                }

                break;
            }
        }
    }
	
	public static void borrarLibro(int codigo) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i].getCodigo() == codigo ) {
                for (int j = i; j < biblioteca.length - 1; j++) {
                    biblioteca[j] = biblioteca[j + 1];
                }
            }
        }
    }
		
		
	}

