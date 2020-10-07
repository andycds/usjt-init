package br.usjt.sistemaAcademico;

public class AlunoDeGraduacao extends Aluno {
	private double nota1, nota2, notaFinal;
	
	public AlunoDeGraduacao(String nome, int idade) {
		super(nome, idade);
	}
	
	public String toString() {
		return "Graduação: " + super.toString();
	}
}
