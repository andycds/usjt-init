package br.usjt.sistemaAcademico;

public class TesteLecionar {
	public static void main(String[] args) {
		ProfessorHorista profHorista = new ProfessorHorista("Rodrigo", 20);
		ProfessorPesquisador profPesq = new ProfessorPesquisador("José", 65);
		profHorista.lecionar();
		profPesq.lecionar();
	}
}