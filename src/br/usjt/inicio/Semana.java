package br.usjt.inicio;

import javax.swing.JOptionPane;

/**
 * Usando switch-case, escrever um programa que lê um inteiro entre 1 e 7
e exibe o dia da semana correspondente a esse número. Isto é, domingo se
1, segunda-feira se 2, e assim por diante.
 * @author anderson
 */
public class Semana {
	public static void main(String[] args) {
		//double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
		//	JOptionPane.showMessageDialog(null, "Aprovado");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		String semana;
		switch (numero) {
		case 1:
			semana = "domingo";
			break;
		case 2:
			semana = "segunda";
			break;
		case 3:
			semana = "terça";
			break;
		case 4:
			semana = "quarta";
			break;
		case 5:
			semana = "quinta";
			break;
		case 6:
			semana = "sexta";
			break;
		default:
			semana = "sábado";
		}
		JOptionPane.showMessageDialog(null, "O dia da semana é: " + semana);
	}
}
