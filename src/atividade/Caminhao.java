package atividade;

public class Caminhao extends Veiculo {

	private double preco;
	private String cor;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Caminhao(double preco, String cor) {
		this.preco = preco;
		this.cor = cor;
	}

	public Caminhao() {

	}
}
