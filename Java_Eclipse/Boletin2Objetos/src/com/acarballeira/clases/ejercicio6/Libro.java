package com.acarballeira.clases.ejercicio6;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class Libro {
	
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	protected String editorial;
	protected int codigo = 0;
	
	public Libro(String titulo, String autor, int codigo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
	}
	
	public Libro(String titulo, String autor, int numPaginas, String editorial, int codigo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.editorial = editorial;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public int getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + numPaginas;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigo != other.codigo)
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (numPaginas != other.numPaginas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [" + (titulo != null ? "titulo=" + titulo + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "") + "numPaginas=" + numPaginas + ", "
				+ (editorial != null ? "editorial=" + editorial + ", " : "") + "codigo=" + codigo + "]";
	}


}
