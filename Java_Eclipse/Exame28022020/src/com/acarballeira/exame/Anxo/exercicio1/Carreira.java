package com.acarballeira.exame.Anxo.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class Carreira {

	private LocalDate data;
	private String nome;
	private Double quilometros;
	private ArrayList<Participante> participantes;

	public Carreira() {		
		this.nome = "Carreira xenérica";
		this.quilometros = 10.0;
		this.data = asignarData();
		this.participantes = new ArrayList<Participante>();
	}
	
	public Carreira(String nome, Double quilometros, LocalDate data) {
		this();
		this.data = data;
		this.nome = nome;
		this.quilometros = quilometros;
		this.participantes = new ArrayList<Participante>();
	}
	
	public Carreira(String nome, Double quilometros) {
		this();
		this.nome = nome;
		this.quilometros = quilometros;
		this.data = asignarData();
		this.participantes = new ArrayList<Participante>();
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(Double quilometros) {
		this.quilometros = quilometros;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	private LocalDate asignarData() {
		LocalDate fecha = LocalDate.now().plusDays(7);
		return fecha;
	}
	
	public boolean engadirParticipante(Participante p) {
		if(participantes.add(p)) {
			return true;
		}		
		return false;
	}
	
	public boolean eliminarParticipante(Participante p) {
		return participantes.remove(p);
	}
	
	public boolean eliminarParticipante(int i) {
		return (participantes.remove(i) != null);
	}
	
	public Participante[] getArrayParticipantes() {
		return participantes.toArray(new Participante[0]);
	}
	
	public String getSringParticipantes() {
		return participantes.toString();
	}
	
	public void ordenar() {
		Collections.sort(participantes, new ComparacionNick().thenComparing(new ComparacionDorsal()));
	}

	@Override
	public String toString() {
		return "Carreira [" + (data != null ? "data=" + data + ", " : "") + (nome != null ? "nome=" + nome + ", " : "")
				+ (quilometros != null ? "quilometros=" + quilometros : "") + "]";
	}
	
//	private boolean exportar(File f) {
//		String entradaString = "";
//		BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
//		bw.write(entradaString);
//		bw.close();
//	}
	
	
		
}

class ComparacionNick implements Comparator<Participante> {

	@Override
	public int compare(Participante o1, Participante o2) {
		return o1.nick.compareTo(o2.nick);
	}

}

class ComparacionDorsal implements Comparator<Participante> {
	
	@Override
	public int compare(Participante o1, Participante o2) {
		return (o1.dorsal > o2.dorsal) ? 1 : (o1.dorsal < o2.dorsal) ? -1 : 0;
	}
	
}
