package br.usjt.aluno.livroDeNotas;

import java.util.Random;

public class LivroDeNotas {
	private String nomeDisciplina;
	private double notas1[];
	private double notas2[];
	private double medias[];
	private int qtdeAlunos;

	public LivroDeNotas(String nomeDisciplina, int qtdeAlunos) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas1 = new double[qtdeAlunos];
		this.notas2 = new double[qtdeAlunos];
		this.medias = new double[qtdeAlunos];
		this.qtdeAlunos = qtdeAlunos;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void gerarNotas() {
		Random gerador = new Random();
		for (int i = 0; i < this.qtdeAlunos; i++) {
			this.notas1[i] = gerador.nextDouble() * 10;
			this.notas2[i] = gerador.nextDouble() * 10;
		}
	}

	public void calcularMedias() {
		for (int i = 0; i < this.notas1.length; i++) {
			double media = (this.notas1[i] + this.notas2[i]) / 2;
			this.medias[i] = media;
		}
	}

	public String obterMedias() {
		StringBuilder todasAsMedias = new StringBuilder();
		for (int i = 0; i < qtdeAlunos; i++) {
			todasAsMedias.append(String.format("Aluno %d: %.2f\n", i + 1,
					medias[i]));
		}
		return todasAsMedias.toString();
	}

	public double maiorMedia() {
		double maiorMedia = medias[0];
		for (int i = 1; i < medias.length; i++) {
			if (medias[i] > maiorMedia) {
				maiorMedia = medias[i];
			}
		}
		return maiorMedia;
	}
	
	public double mediaTurma() {
		double somaMediaTurma = 0;
		for (int i = 0; i < medias.length; i++) {
			somaMediaTurma += medias[i];
		}
		return somaMediaTurma / qtdeAlunos;
	}
	
	public double varianciaMedias() {
		double mediaTurma = mediaTurma();
		double somaQuadradoDaDiferenca = 0;
		for (int i = 0; i < medias.length; i++) {
			somaQuadradoDaDiferenca += Math.pow((medias[i] - mediaTurma), 2);
		}
		return somaQuadradoDaDiferenca / (qtdeAlunos - 1);
	}
	
	public double desvioPadraoMedias() {
		return Math.sqrt(varianciaMedias());
	}
}
