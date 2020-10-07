package br.usjt.inicio;

import java.util.Scanner;

//1.  Dados n e n seqüências de números inteiros não-nulos, cada qual seguida por um 0,
//calcular a soma dos números pares de cada seqüência.
public class SomaParSequencia {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de sequências: ");
		int n = leitor.nextInt();
		int numero;
		for (int i = 0; i < n; i++) {
			int somaPar = 0;
			System.out.println("Sequência " + (i + 1));
			do {
				numero = leitor.nextInt();
				if (numero % 2 == 0) {
					somaPar += numero;
				}
			} while (numero != 0);
			System.out.println("A soma dos pares dessa sequência é: " + somaPar);
		}
	}
}
