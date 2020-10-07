package br.usjt.time;

public class Time {
	private String nome;
	private Jogador[] jogadores;
	
	public String toString() {
		StringBuilder resposta = new StringBuilder();
		resposta.append("   Escalação do " + nome + ":\n");
		for (int i = 0; i < jogadores.length; i++) {
			resposta.append("      " + jogadores[i] + "\n");
		}
		return resposta.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Jogador[] getJogadores() {
		return jogadores;
	}
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
}
