package br.usjt.aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno leo = new Aluno("Leo", 123456);
		Aluno eric = new Aluno("Eric", 987654);
		
		System.out.println(leo.textoInformativo());
		System.out.println(eric.textoInformativo());
		
		leo.setMatricula(2);
		eric.setNome("Guilherme");
		
		System.out.println(leo.textoInformativo());
		System.out.println(eric.textoInformativo());
		
	}

}
