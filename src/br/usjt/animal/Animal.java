package br.usjt.animal;

public class Animal {
	private String nome;
	private int patas;
	
	public Animal() {
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public Animal(String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
	}
	
	public String toString() {
		return nome + ", " + patas + " patas";
	}
}
