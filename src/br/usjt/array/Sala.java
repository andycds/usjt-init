package br.usjt.array;

import java.util.Scanner;

public class Sala {
	private static Aluno[] alunos;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto alunos? ");
		int quantAluno = sc.nextInt();
		
		alunos = new Aluno[quantAluno];

		String nome;
		double nota;
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
			System.out.println("Digite a nota: ");
			nota = sc.nextDouble();
			Aluno aluno = new Aluno(nome, nota);
			alunos[i] = aluno;
		}
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("ID: " + i + " -> " + alunos[i]);
		}
	}
}
