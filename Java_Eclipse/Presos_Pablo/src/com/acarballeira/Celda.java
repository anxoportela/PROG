package com.acarballeira;

import java.util.Arrays;

public class Celda {
    String nombre;
    boolean abierta;
    int capacidad = 5;
    Preso[] presos;
    int numPresos = 0;
    
    public Celda() {}
    public Celda(String nombre, boolean abierta, int capacidad) {
        this.nombre = nombre;
        this.abierta = abierta;
        this.capacidad = capacidad;
        presos = new Preso[capacidad];
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isAbierta() {
        return abierta;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    public void abrir(String cod) {
    	if(cod.equals("1234")) {
    		this.abierta = true;
    	} else {
    		System.out.println("Código Incorrecto");
    	}
    }
    public void cerrar(String cod) {
    	if(cod.equals("1234")) {
    		this.abierta = false;
    	} else {
    		System.out.println("Código Incorrecto");
    	}
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s%nAbierta: %s%n", nombre, abierta ? "Si" : "No");
    }
    
    public String getPresos() {
        String salida = "Celda " + nombre + "\n";
        for (Preso preso : presos) {
            salida += (preso!=null) ? preso.getCodigo() + "\n" : "";

        }
        return salida;
    }

    public void engadirPreso(Preso p) {
        for(int i = 0; i < capacidad;i++) {
            if (presos[i] == null) {
                presos[i] = p;
                break;
            } 
            if (i == (capacidad - 1)) {
                System.out.println("Celda llena");
                
            }
        }
    }
    
    public void quitarPreso(Preso p) {
        for (int i = 0; i < capacidad; i++) {
            if(presos[i] == p) {
                presos[i] = null;
            } else {
                System.out.println("");
            }
        }
    }
    
}
