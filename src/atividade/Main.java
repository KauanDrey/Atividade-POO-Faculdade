package atividade;

public class Main {

	public static void main(String[] args) {

		Caminhao c = new Caminhao();

		// DIGITE AQUI O MODELO DO SEU CAMINHÃO
		c.setModelo("Mercedez");

		// DIGITE AQUI A PLACA DO SEU CAMINHÃO
		c.setPlaca("EDU-123");

		// DIGITE AQUI A COR DO SEU CAMINHÃO
		c.setCor("PRATA");

		// DIGITE AQUI O PREÇO DO SEU CAMINHÃO
		c.setPreco(100000.0);

		// A CADA CHAMADA DESSE MÉTODO O CAMINHÃO ACELERA +10
		c.acelerar();
		c.acelerar();

		// A CADA CHAMADA DESSE MÉTODO O CAMINHÃO FREA -10
		// IMPLEMENTADO REGRA PARA SER IMPOSSÍVEL FREAR O CAMINHÃO CASO JÁ ESTEJA PARADO
		// COM 0 KM/H
		c.frear();

		System.out.println("CAMINHÃO");
		System.out.println("Modelo: " + c.getModelo() + "\nPlaca: " + c.getPlaca() + "\nCor: " + c.getCor()
				+ "\nPreço: " + c.getPreco() + "\nVelocidade atual do caminhão: " + c.getVelocidade() + " KM/H");

		System.out.println();
		System.out.println("===================================================================================");

		System.out.println();
		System.out.println("ÔNIBUS");

		Onibus o = new Onibus();

		// DIGITE AQUI O MODELO DO SEU ÔNIBUS
		o.setModelo("VOLVO");

		// DIGITE AQUI A PLACA DO SEU CAMINHÃO
		o.setPlaca("KAU-123");

		// DIGITE AQUI A COR DO SEU CAMINHÃO
		o.setCor("VERMELHO");

		// DIGITE AQUI O PREÇO DO SEU CAMINHÃO
		o.setPreco(150000.0);

		// A CADA CHAMADA DESSE MÉTODO O CAMINHÃO ACELERA +10
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();

		// A CADA CHAMADA DESSE MÉTODO O CAMINHÃO FREA -10
		// IMPLEMENTADO REGRA PARA SER IMPOSSÍVEL FREAR O CAMINHÃO CASO JÁ ESTEJA PARADO
		// COM 0 KM/H
		o.frear();

		System.out.println("Modelo: " + o.getModelo() + "\nPlaca: " + o.getPlaca() + "\nCor: " + o.getCor()
				+ "\nPreço: " + o.getPreco() + "\nVelocidade atual do Ônibus: " + o.getVelocidade() + " KM/H");

	}

}
