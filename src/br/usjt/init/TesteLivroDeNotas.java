package br.usjt.init;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
	public static void main(String[] args) {
		String primeiroCurso = JOptionPane.showInputDialog ("Prof, qual o nome do 1o curso?");
		String segundoCurso = JOptionPane.showInputDialog ("Prof, qual o nome do 1o curso?");
		LivroDeNotas livroDeNotas1 = new LivroDeNotas(primeiroCurso);
		LivroDeNotas livroDeNotas2 = new LivroDeNotas(segundoCurso);
		livroDeNotas1.exibirMensagem();
		livroDeNotas2.exibirMensagem();
		
		livroDeNotas1.setNomeDoCurso("Isto é um palavrão");
		livroDeNotas2.setNomeDoCurso("Nome correto");
		
		livroDeNotas1.exibirMensagem();
		livroDeNotas2.exibirMensagem();
		
	}
}
