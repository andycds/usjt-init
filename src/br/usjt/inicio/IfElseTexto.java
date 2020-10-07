package br.usjt.inicio;

import java.util.Scanner;

public class IfElseTexto {
	public static void main(String[] args) {
		System.out.println("Digite uma nota: ");
		Scanner leitor = new Scanner(System.in);
		double nota = leitor.nextDouble();
		if (nota >= 70) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
