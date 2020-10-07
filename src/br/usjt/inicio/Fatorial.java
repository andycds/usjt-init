package br.usjt.inicio;

import javax.swing.JOptionPane;

public class Fatorial {
	 public static void main(String[] args) {
//				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
//				JOptionPane.showMessageDialog(null, "Aprovado");
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		 int resultado = 1;
		 for (int i = 2; i <= numero; i++) {
			 resultado *= i; // resultado = resultado * i
		 }
		 JOptionPane.showMessageDialog(null, "Fatorial: " + resultado);
	 }
}
