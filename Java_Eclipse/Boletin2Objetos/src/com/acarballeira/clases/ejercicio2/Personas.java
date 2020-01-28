package com.acarballeira.clases.ejercicio2;

/**
 *
 * @author dual108
 * @date 28 ene. 2020
 * @version 1.0
 *
 */

public class Personas {
	
	protected String nombre;
	protected String dni;
	protected Estado_Civil estadocivil;
	
	public Personas(String nombre, String dni, Estado_Civil estadocivil) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.estadocivil = estadocivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Estado_Civil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(Estado_Civil estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((estadocivil == null) ? 0 : estadocivil.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (estadocivil != other.estadocivil)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Datos personales%nNombre: %s%nDNI: %s%nEstado Civil: %s", nombre,dni,estadocivil);
	}
	
	

}
