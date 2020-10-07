package br.usjt.inicio;

import java.util.Scanner;

/*
 * 2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário.
 */

public class MaiorMenor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = leitor.nextInt();
//		if (idade >= 18) {
//			System.out.println("Maior de idade");
//		} else {
//			System.out.println("Menor de idade");
//		}
		String resposta = (idade >= 18) ? "maior" : "menor";
		System.out.println(resposta);
	}
}
