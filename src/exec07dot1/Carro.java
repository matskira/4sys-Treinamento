package exec07dot1;

/**
 * Classe Carro
 * @author mpoda
 *13/02/2020
 *@version 0.1
 */

public class Carro {
	
	String modelo;
	String cor;
	String placaDoCarro;
	int velocidadeMax;
	String combustivel;
	double valor;
	boolean vendido = false;
	
	
	public Carro() {
	}

	public Carro(String modelo,String cor, String placaDoCarro, int velocidadeMax, String combustivel, double valor) {
		this.cor = cor;
		this.modelo = modelo;
		this.placaDoCarro = placaDoCarro;
		this.velocidadeMax = velocidadeMax;
		this.combustivel = combustivel;
		this.valor = valor;
	}

}
	

