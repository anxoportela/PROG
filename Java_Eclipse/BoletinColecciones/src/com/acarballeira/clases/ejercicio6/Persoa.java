package com.acarballeira.clases.ejercicio6;

public class Persoa {
	
	protected String nombre;
	protected int edad;
	
	public Persoa(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persoa [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
