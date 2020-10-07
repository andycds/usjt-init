package br.usjt.sistemaAcademico;

public class Pessoa {
	private String nome;
	private int idade;
	
//	public Pessoa() {
//		System.out.println("Construindo uma Pessoa...");
//	}
	
	public Pessoa(String nome, int idade) {
		System.out.println("Construindo uma Pessoa...");
		setNome(nome);
		setIdade(idade);
	}
	
	public String toString() {
		return "nome: " + nome + " idade: " + idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}