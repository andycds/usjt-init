package br.usjt.sistemaAcademico;

public class ProfessorPesquisador extends Professor {
	public ProfessorPesquisador(String nome, int idade) {
		super(nome, idade);
	}
	//getters/setters
	public void pesquisar () {
		System.out.println("Pesquisando...");
	}
}
