package br.usjt.carro;

import java.util.Scanner;

public class TesteCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o motor do carro: ");
		String motor = sc.next();
		System.out.println("Digite a cor do carro: ");
		String cor = sc.next();
		Carro corsa = new Carro(motor, cor);
		
		System.out.println("Digite o motor do carro: ");
		motor = sc.next();
		System.out.println("Digite a cor do carro: ");
		cor = sc.next();
		Carro celta = new Carro(motor, cor);
		
		System.out.println("Corsa");
		corsa.ligar();
		corsa.buzinar();
		System.out.println("Com motor: " + corsa.getMotor() + " e cor: " + corsa.getCor());
		System.out.println("Celta");
		celta.ligar();
		celta.buzinar();
		System.out.println("Com motor: " + celta.getMotor() + " e cor: " + celta.getCor());
		
		
	}

//	private static void atribuirCaracteristicas(Carro carro) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o motor do carro: ");
//		String motor = sc.next();
//		System.out.println("Digite a cor do carro: ");
//		String cor = sc.next();
//		carro.setMotor(motor);
//		carro.setCor(cor);
//	}
}
