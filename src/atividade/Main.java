package atividade;

public class Main {

	public static void main(String[] args) {

		Caminhao c = new Caminhao();

		// DIGITE AQUI O MODELO DO SEU CAMINH�O
		c.setModelo("Mercedez");

		// DIGITE AQUI A PLACA DO SEU CAMINH�O
		c.setPlaca("EDU-123");

		// DIGITE AQUI A COR DO SEU CAMINH�O
		c.setCor("PRATA");

		// DIGITE AQUI O PRE�O DO SEU CAMINH�O
		c.setPreco(100000.0);

		// A CADA CHAMADA DESSE M�TODO O CAMINH�O ACELERA +10
		c.acelerar();
		c.acelerar();

		// A CADA CHAMADA DESSE M�TODO O CAMINH�O FREA -10
		// IMPLEMENTADO REGRA PARA SER IMPOSS�VEL FREAR O CAMINH�O CASO J� ESTEJA PARADO
		// COM 0 KM/H
		c.frear();

		System.out.println("CAMINH�O");
		System.out.println("Modelo: " + c.getModelo() + "\nPlaca: " + c.getPlaca() + "\nCor: " + c.getCor()
				+ "\nPre�o: " + c.getPreco() + "\nVelocidade atual do caminh�o: " + c.getVelocidade() + " KM/H");

		System.out.println();
		System.out.println("===================================================================================");

		System.out.println();
		System.out.println("�NIBUS");

		Onibus o = new Onibus();

		// DIGITE AQUI O MODELO DO SEU �NIBUS
		o.setModelo("VOLVO");

		// DIGITE AQUI A PLACA DO SEU CAMINH�O
		o.setPlaca("KAU-123");

		// DIGITE AQUI A COR DO SEU CAMINH�O
		o.setCor("VERMELHO");

		// DIGITE AQUI O PRE�O DO SEU CAMINH�O
		o.setPreco(150000.0);

		// A CADA CHAMADA DESSE M�TODO O CAMINH�O ACELERA +10
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();
		o.acelerar();

		// A CADA CHAMADA DESSE M�TODO O CAMINH�O FREA -10
		// IMPLEMENTADO REGRA PARA SER IMPOSS�VEL FREAR O CAMINH�O CASO J� ESTEJA PARADO
		// COM 0 KM/H
		o.frear();

		System.out.println("Modelo: " + o.getModelo() + "\nPlaca: " + o.getPlaca() + "\nCor: " + o.getCor()
				+ "\nPre�o: " + o.getPreco() + "\nVelocidade atual do �nibus: " + o.getVelocidade() + " KM/H");

	}

}
