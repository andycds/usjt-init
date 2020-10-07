package br.usjt.sistemaAcademico;

public class Professor extends Pessoa {
	int matricula;
	
	public Professor(String nome, int idade) {
		super(nome, idade);
	}
	
	public void lecionar() {
		System.out.println(getNome() + " lecionando...");
	}
}
