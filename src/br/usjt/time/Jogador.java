package br.usjt.time;

public class Jogador {
	private String nome;
	private int nChuteira;

	public Jogador(String nome, int nChuteira) {
		this.nome = nome;
		this.nChuteira = nChuteira;
	}
	
	public String toString() {
		return nome + " usa chuteira " + nChuteira;
	}
	
	public void chutar() {
		System.out.println(nome + " chutou");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnChuteira() {
		return nChuteira;
	}
	public void setnChuteira(int nChuteira) {
		this.nChuteira = nChuteira;
	}
	
	
}
