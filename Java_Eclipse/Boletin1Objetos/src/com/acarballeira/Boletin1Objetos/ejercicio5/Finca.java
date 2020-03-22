package com.acarballeira.Boletin1Objetos.ejercicio5;


/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Finca extends Parcela {
	
	private Parcela parcela;
	private String toponimo;
	private TipoCultivo cultivo;
	private boolean regadio;
	private double metrosLimpios;
	


	public Finca(double metros, Coordenada puntoRef1, Coordenada puntoRef2) {
		super(metros, puntoRef1, puntoRef2);
	}

	public Finca(double metros, Coordenada puntoRef1, Coordenada puntoRef2, Parcela parcela, String toponimo,
			TipoCultivo cultivo, boolean regadio, double metrosLimpios) {
		super(metros, puntoRef1, puntoRef2);
		this.parcela = parcela;
		this.toponimo = toponimo;
		this.cultivo = cultivo;
		this.regadio = regadio;
		this.metrosLimpios = metrosLimpios;
	}


	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public String getToponimo() {
		return toponimo;
	}

	public void setToponimo(String toponimo) {
		this.toponimo = toponimo;
	}

	public TipoCultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(TipoCultivo cultivo) {
		this.cultivo = cultivo;
	}

	public boolean isRegadio() {
		return regadio;
	}

	public void setRegadio(boolean regadio) {
		this.regadio = regadio;
	}

	public double getMetrosLimpios() {
		return metrosLimpios;
	}

	public void setMetrosLimpios(double metrosLimpios) {
		this.metrosLimpios = metrosLimpios;
	}
	
	public void incrementarSupALimpar(double supLimpiarInc) {
		if((metrosLimpios-supLimpiarInc)>this.getMetros()||(metrosLimpios-supLimpiarInc)<0) {
			metrosLimpios=0;
		} else {
			metrosLimpios-=supLimpiarInc;			
		}
	}
	
	public void decrementarSupALimpar(double supLimpiarDec) {
		if((metrosLimpios+supLimpiarDec)>this.getMetros()||(metrosLimpios+supLimpiarDec)<0) {
			metrosLimpios = parcela.getMetros();
		} else {
			metrosLimpios+=supLimpiarDec;			
		}
	}

	@Override
	public String toString() {
        return String.format("*** FINCA *** %s%nTipo de cultivo: %s%nRegadío: %b%nCoordenadas de referencia: %d,%d - %d,%d%n"
                + "Metros totais: %.3f%nMetrosLimpos: %.3f%n", this.toponimo, this.cultivo, this.regadio, parcela.getPuntoRef1().getCoordX(), parcela.getPuntoRef1().getCoordY(),
                parcela.getPuntoRef2().getCoordX(), parcela.getPuntoRef2().getCoordY(), parcela.getMetros(), this.metrosLimpios);
        
    }


	
}
