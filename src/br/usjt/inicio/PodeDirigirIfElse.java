package br.usjt.inicio;

import javax.swing.JOptionPane;

public class PodeDirigirIfElse {
	public static void main(String[] args) {
		boolean idadeInvalida = true;
		int idade = 0;
		while (idadeInvalida) {
			try {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
				idadeInvalida = false;
			} catch (Exception e) { // não pegue todas as exceções
				JOptionPane.showInternalMessageDialog(null, "Digite um número!");
			}
		}
		String podeDirigir = (idade >= 18) ? "Sim, você pode dirigir" : "Não, você não pode dirigir por enquanto";
		JOptionPane.showMessageDialog(null, podeDirigir);
	}
}