package br.usjt.impressora;

public class Impressora {
	
//	um único float.
	public void exibir(float a) {
		System.out.println(a);
	}
	
//	1.2 dois floats.
	public void exibir(float a, float b) {
		System.out.println(a + ", " + b);
	}
	
//	1.3 um float e uma String, nessa ordem.
	public void exibir(float a, String b) {
		System.out.println(a + ", " + b);
	}

//	1.4 uma String e um float, nessa ordem.
	public void exibir(String a, float b) {
		System.out.println(a + ", " + b);
	}

//	1.5 três Strings.
	public void exibir(String a, String b, String c) {
		System.out.println(a + ", " + b + ", " + c);
	}

//	1.6 dois ints e uma String, nessa ordem.
	public void exibir(int a, int b, String c) {
		System.out.println(a + ", " + b + ", " + c);
	}

}
