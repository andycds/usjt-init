package br.usjt.sistemaAcademico;

public class Aluno extends Pessoa {
//	public Aluno() {
//		System.out.println("Construindo Aluno...");
//	}
	public Aluno(String nome, int idade) {
		super(nome, idade);
		System.out.println("Construindo Aluno...");
	}
	
	public String toString() {
		return "Aluno: " + super.toString();
	}
}
