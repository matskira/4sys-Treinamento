package exec03;
/**
 * Classe Produto!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */
//Aqui temos a classe Produto!
public class Produto {
	//Aqui temos os atributos da classe Produto.
	String nome = "";
	double quantidade = 10;
	double custo = 100 ;
	double quantidadeVendida = 4;
	double percentualDeLucro = 10 ;
	//Aqui temos os métodos da classe Produto.
	public void exibirNome(){
		if (nome != null) {		
			System.out.println("Nome do produto: " + this.nome);
		}else{
			System.out.println("Não possui nome de produto, é nulo.");
		}
	}
	
	public void exibirValor(){
		if ((custo > 0) || (percentualDeLucro > 0)) {
			double percentualConvertido = this.percentualDeLucro/100;
			double lucro = this.custo * percentualConvertido;
	 		double valor = this.custo + lucro;
			System.out.println("O Valor do produto: " + valor);
		} else {
			System.out.println("Valores usados são nulos ou menores que zero.");
		}
	}	
	
	public void exibirLucro(){
		if ((custo > 0) || (percentualDeLucro > 0)) {
			double percentualConvertido = this.percentualDeLucro/100;
			double lucro = this.custo * percentualConvertido;
			System.out.println("Valor do lucro: "+lucro);
		}else{
			System.out.println("Valores usados são nulos ou menores que zero.");
		}
	}
	
	public void exibirTudo(){
		exibirNome();
		exibirValor();
		exibirLucro();
	}
}
