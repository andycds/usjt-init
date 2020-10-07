package br.usjt.inicio;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
//Exemplo: Para n=4 a saída deverá ser 1,3,5,7.
public class NImpares {
	public static void main(String[] args) {
		Scanner toto = new Scanner(System.in);
		int n = toto.nextInt();
//		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ímpares"));
		for (int i = 1; i < n * 2; i += 2) {
			System.out.println(i);
		}
	}
}
