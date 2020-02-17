package exec07dot1;

public class Carro {
	String modelo;
	String cor;
	String placaDoCarro;
	int velocidadeMax;
	String combustivel;
	double valor;
	boolean vendido;
	boolean vetorDisponivel;
	
	public Carro() {
	}

	public Carro(String modelo,String cor,String placaDoCarro, int velocidadeMax, String combustivel, double valor, boolean vendido, boolean vetorDisponivel) {
		this.cor = cor;
		this.modelo = modelo;
		this.placaDoCarro = placaDoCarro;
		this.velocidadeMax = velocidadeMax;
		this.combustivel = combustivel;
		this.valor = valor;
		this.vendido = vendido;
		this.vetorDisponivel = vetorDisponivel;
	}

}
