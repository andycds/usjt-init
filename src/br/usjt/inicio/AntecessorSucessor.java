package br.usjt.inicio;

import java.util.Scanner;

/**
 * Ler um número inteiro e exibir o seu antecessor e o seu sucessor.
 * @author anderson
 */
public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		System.out.println("Antecessor: " + (numero - 1));
		System.out.println("Sucessor: " + (numero + 1));
	}

}
