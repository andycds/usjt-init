package br.usjt.inicio;

import javax.swing.JOptionPane;

//  Dado um número inteiro positivo n, determinar todos os inteiros entre 1 e n 
// que são comprimento da hipotenusa de um triângulo retângulo com catetos inteiros.
public class Hipotenusa {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		for (int i = 1; i <= n; i++) {
			if (ehHipotenusa(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean ehHipotenusa(int i) {
		for (int c1 = 1; c1 <= i; c1++) {
//			for (int c2 = 1; c2 <= i; c2++) {
			int c2 = c1 + 1;
			while (c1*c1 + c2*c2 < i*i) {
				c2++;
			}
			if (i*i == c1*c1 + c2*c2) {
				System.out.println(i+"² = " + c1 + "² + " + c2 + "²");
				return true;
			}	
		}
		return false;
	}
}
