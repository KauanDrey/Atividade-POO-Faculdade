package atividade;

public class Veiculo {

	private String Modelo;
	private String Placa;
	private int velocidade;

	public String getAcelerar() {
		return getAcelerar();
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar() {
		this.setVelocidade(getVelocidade() + 10);
	}

	public void frear() {
		if (this.getVelocidade() <= 0) {
			this.setVelocidade(0);
			System.out.println("Veículo já se encontra parado");

		} else {
			this.setVelocidade(getVelocidade() - 10);
		}
	}

}
