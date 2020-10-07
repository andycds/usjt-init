package br.usjt.arrayNovo;

import javax.swing.JOptionPane;

public class TesteVetorDeInts {
	public static void main(String[] args) {
		//declarando um vetor
		//note que há uma variável de referência e um objeto (o vetor)
		//esse vetor tem cinco inteiros
		int[] v = new int[5];
		v[5] = 1;
		//iniciando as posições de um vetor
		v[0] = 1;
		v[1] = 6;
		v[2] = 8;
		v[3] = 10;
		//também dá para iniciar com valores digitados pelo usuário
		v[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
		//mostrando o conteúdo
		JOptionPane.showMessageDialog(null, v[0]);
		JOptionPane.showMessageDialog(null, v[1]);
		JOptionPane.showMessageDialog(null, v[2]);
		JOptionPane.showMessageDialog(null, v[3]);
		JOptionPane.showMessageDialog(null, v[4]);
	}
}
