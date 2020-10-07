package br.usjt.impressora;

public class TesteImpressora {
	public static void main(String[] args) {
		Impressora impressoa = new Impressora();
		impressoa.exibir(1F);
		impressoa.exibir(1F, 2F);
		impressoa.exibir(1F, " oi ");

		impressoa.exibir(" tchau ", 1F);
		impressoa.exibir("Não", "aguento", "mais");
		impressoa.exibir(1, 2, " acabou!");
	}
}
