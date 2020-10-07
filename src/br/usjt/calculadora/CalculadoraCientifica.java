package br.usjt.calculadora;

public class CalculadoraCientifica {
//	int pow(int a, int b) {
//		return (int) Math.pow(a, b);
//	}
//	
//	double pow(double a, double b) {
//		return Math.pow(a, b);
//	}
//	
//	int rad(int a, int b) {
//		return (int) Math.pow(a, 1 / (double) b);
//	}
//	
//	double rad(double a, double b) {
//		return Math.pow(a, 1 / b);
//	}
	
	double raiz(int a) {
		return Math.sqrt(a);
	}
	
	double raiz(double a) {
		return Math.sqrt(a);
	}
	
	double raiz(String a) {
		return Math.sqrt(Double.parseDouble(a));
	}
	
	double potencia(byte a, byte b) {
		return Math.pow(a, b);
	}
	
	double potencia(String s1, String s2) {
		return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
	}
	
	double potencia(int a, double b) {
		return Math.pow(a, b);
	}
}
