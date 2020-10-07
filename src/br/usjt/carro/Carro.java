package br.usjt.carro;

public class Carro {
	private String motor;
	private String cor;
	
	public Carro(String motor, String cor) {
		this.motor = motor;
		this.cor = cor;
	}
	
	public void ligar() {
		System.out.println("Vrum, vrum, vrum");
	}
	
	public void buzinar() {
		System.out.println("Fom-fom");
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
