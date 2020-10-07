package br.usjt.sistemaAcademico;

public class AlunoDePosGraduacao extends Aluno {
	private char conceito;
	
	public AlunoDePosGraduacao(String nome, int idade) {
		super(nome, idade);
	}
	
	public String toString() {
		return "Pós-graduação: " + super.toString();
	}
}
