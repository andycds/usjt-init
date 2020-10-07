package br.usjt.inicio;

import java.util.Scanner;

//Dados n e uma seqüência de n números inteiros, determinar a soma dos números pares.
public class SomaSequenciaPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da sequência: ");
		int n = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("\nDigite o número: ");
			int numero = sc.nextInt();
			// se o número é par, adiciono na soma
			if (numero % 2 == 0) {
				soma += numero;
			}
		}
		System.out.println("A soma dos pares é: " + soma);
	}
}
