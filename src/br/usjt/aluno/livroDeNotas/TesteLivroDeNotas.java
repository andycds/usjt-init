package br.usjt.aluno.livroDeNotas;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
	public static void main(String[] args) {
		//instancia um livro de notas para a disciplina Programação com 10 alunos
		LivroDeNotas livro = new LivroDeNotas("Programação", 10);
		//gera notas aleatórias
		livro.gerarNotas();
		//calcula as médias
		livro.calcularMedias();
		//exibe as médias
		livro.obterMedias();
		JOptionPane.showMessageDialog(null, livro.obterMedias());
		JOptionPane.showMessageDialog(null, "A média da turma foi: " + livro.mediaTurma());
		JOptionPane.showMessageDialog(null, "A média mais alta foi: " + livro.maiorMedia());
		JOptionPane.showMessageDialog(null, "Variância: " + livro.varianciaMedias());
		JOptionPane.showMessageDialog(null, "Desvio padrão: " + livro.desvioPadraoMedias());
	}
}