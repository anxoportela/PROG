/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class Mas_Strings_17_v2 {

    public static void main(String[] args) {
        init();
    }

    static void init() {
        JFrame ventana;
        //ventana = new JFrame("Título Ventana");
        ventana = new JFrame();
        ventana.setBounds(100, 100, 600, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Título de la Ventana");
        ventana.getContentPane().setLayout(null);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(150, 30, 400, 25);

        JLabel etiquetaTexto = new JLabel("Frase");
        etiquetaTexto.setBounds(20, 30, 150, 25);
        JLabel numPalabras = new JLabel("Número palabras: ");
        numPalabras.setBounds(20, 60, 500, 25);
        JLabel primeraPalabra = new JLabel("La primera palabra es: ");
        primeraPalabra.setBounds(20, 90, 500, 25);
        JLabel ultimaPalabra = new JLabel("La última palabra es: ");
        ultimaPalabra.setBounds(20, 120, 500, 25);
        JLabel ordPalabras = new JLabel("Las palabras ordenadas A-Z: ");
        ordPalabras.setBounds(20, 150, 500, 25);
        JLabel ordRevPalabras = new JLabel("Las palabras ordenadas Z-A: ");
        ordRevPalabras.setBounds(20, 180, 500, 25);

        JButton botonEnviar = new JButton("Calcular");
        botonEnviar.setBounds(140, 400, 90, 25);
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(20, 400, 90, 25);

        ventana.getContentPane().add(campoTexto);
        ventana.getContentPane().add(etiquetaTexto);
        ventana.getContentPane().add(numPalabras);
        ventana.getContentPane().add(primeraPalabra);
        ventana.getContentPane().add(ultimaPalabra);
        ventana.getContentPane().add(ordPalabras);
        ventana.getContentPane().add(ordRevPalabras);
        ventana.getContentPane().add(botonEnviar);
        ventana.getContentPane().add(botonLimpiar);

        ventana.setVisible(true);

        //Acciones
        botonLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
                numPalabras.setText("Número de palabras: ");
                primeraPalabra.setText("La primera palabra es: ");
                ultimaPalabra.setText("La última palabra es: ");
                ordPalabras.setText("Las palabras ordenadas A-Z: ");
                ordRevPalabras.setText("Las palabras ordenadas Z-A: ");
            }
        });

        botonEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] palabras = campoTexto.getText().split(" ");
                numPalabras.setText(numPalabras.getText() + " " + numPalabras(palabras));
                primeraPalabra.setText(primeraPalabra.getText() + " " + primeraPalabra(palabras));
                ultimaPalabra.setText(ultimaPalabra.getText() + " " + ultimaPalabra(palabras));
                ordPalabras.setText(ordPalabras.getText() + " " + ordenadas(palabras));
                ordRevPalabras.setText(ordRevPalabras.getText() + " " + reves(palabras));
            }
        });
    }

    static int numPalabras(String[] x) {
        return x.length;
    }

    static String primeraPalabra(String[] x) {
        return x[0];
    }

    static String ultimaPalabra(String[] x) {
        return x[x.length - 1];
    }

    static String ordenadas(String[] x) {
        String[] xCambio = Arrays.copyOf(x, x.length);
        Arrays.sort(xCambio);
        return Arrays.toString(xCambio);
    }

    static String reves(String[] x) {
        String[] xCambio = Arrays.copyOf(x, x.length);
        Arrays.sort(xCambio, Collections.reverseOrder());
        return Arrays.toString(xCambio);
    }

}
