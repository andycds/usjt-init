package br.usjt.inicio;

import java.util.Scanner;

public class Primo {
	// Somente divisível por 1 e por ele mesmo: 2, 3, 5, 7, 11, 13...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if (primo(numero)) {
			System.out.println("O número é primo.");
		} else {
			System.out.println("O número não é primo");
		}
	}

	private static boolean primo(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
