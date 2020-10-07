package br.usjt.time;

public class Partida {
	private Time local;
	private Time visitante;
	private int golsLocal;
	private int golsVisitante;
	
	public String toString() {
		return "De um lado: " + local + " fez " + golsLocal + "\n\nE de outro: " + visitante + " fez " + golsVisitante;
	}
	
	public Time getLocal() {
		return local;
	}
	public void setLocal(Time local) {
		this.local = local;
	}
	public Time getVisitante() {
		return visitante;
	}
	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}
	public int getGolsLocal() {
		return golsLocal;
	}
	public void setGolsLocal(int golsLocal) {
		this.golsLocal = golsLocal;
	}
	public int getGolsVisitante() {
		return golsVisitante;
	}
	public void setGolsVisitante(int golsVisitante) {
		this.golsVisitante = golsVisitante;
	}
}
