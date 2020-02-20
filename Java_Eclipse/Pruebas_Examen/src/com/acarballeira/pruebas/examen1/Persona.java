package com.acarballeira.pruebas.examen1;

import java.util.Comparator;
import java.util.Objects;

public class Persona {

	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private static int contador = 1;

	public Persona() {
		super();
		this.id = contador++;
	}

	public Persona(String nombre, String apellidos, int edad, String dni) {
		super();
		this.id = contador++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni="
				+ dni + "]";
	}

}

class ComparaEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return (o1.getEdad() > o2.getEdad()) ? 1 : (o1.getEdad() < o2.getEdad()) ? -1 : 0;
	}

}

class ComparaNombre implements Comparator<Persona>{
	
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}
