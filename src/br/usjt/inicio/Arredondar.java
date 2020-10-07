package br.usjt.inicio;

/**
 * Classe para demonstrar o arredondamento dos números
 * @author anderson
 */
public class Arredondar {
/**
 * 	Método principal, demonstrando os arredondamentos usando a
 * biblioteca Math
 * @param args : não utilizado
 */
	public static void main(String[] args) {
		// comentário uma linha
		double numero = 4.475684; // isto é um comentário
		/* comentário multiplas
		  linhas
		  comentando
		  ola
		 */
		System.out.println(Math.ceil(numero));
		System.out.println(Math.floor(numero));
		System.out.println(Math.round(numero));
	}
}
