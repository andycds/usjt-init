package br.usjt.inicio;

import java.util.Scanner;

public class Laco {

	public static void main(String[] args) {
		// i++ é i = i + 1
//		for (int i = 0; i <= 3; i++) {
//			System.out.println(i);
//		}
//		System.out.println();
//		int i = 0;
//		while (i <= 3) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println();
//		i = -1;
//		do {
//			i++;
//			System.out.println(i);
//		} while(i < 3);
//		System.out.println();
//		i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 3);
		/////////

		Scanner sc = new Scanner(System.in);
//		int resposta = 2;
//		while (resposta != 1) {
//			System.out.println("Este é um programa que não faz nada.");
//			System.out.println("Você quer sair do programa? digite 1 para SIM, 2 para NÃO");
//			resposta = sc.nextInt();
//		}
//		System.out.println("Encerrando o programa.");

		int resposta;
		do {
			System.out.println("Este é um programa que não faz nada.");
			System.out.println("Você quer sair do programa? digite 1 para SIM, 2 para NÃO");
			resposta = sc.nextInt();
		} while(resposta != 1);
		System.out.println("Encerrando o programa.");

	}

}
