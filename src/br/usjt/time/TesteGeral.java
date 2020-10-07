package br.usjt.time;

public class TesteGeral {
	public static void main(String[] args) {
		Jogador pele = new Jogador("Pele", 41);
		Jogador neymar = new Jogador("Neymar", 40);
		Time azul = new Time();
		azul.setNome("Azul");
		Jogador[] jogadores = new Jogador[2];
		jogadores[0] = pele;
		jogadores[1] = neymar;
		azul.setJogadores(jogadores);
		
		Jogador ronaldo = new Jogador("Ronaldo", 43);
		Jogador romario = new Jogador("Romario", 39);
		Time vermelho = new Time();
		vermelho.setNome("Vermelho");
		jogadores = new Jogador[2];
		jogadores[0] = ronaldo;
		jogadores[1] = romario;
		vermelho.setJogadores(jogadores);
		
		Partida jogo = new Partida();
		jogo.setLocal(azul);
		jogo.setVisitante(vermelho);
		jogo.setGolsLocal(3);
		jogo.setGolsVisitante(1);
		
		System.out.println(jogo);
		
	}
}
