package exec03;
/**
 * Classe Carro extend Produto!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */
public class Carro extends Produto{
	String marca = "Ford";
	String modelo = "Ka";
	int ano = 2019;
	String cor = "azul";
	String motor = "v8";
	
	public void exibirCarro(){
		if((marca == null) || (modelo == null) || (ano<1861) || (cor == null) ||(motor == null)){
			System.out.println("Informações inválidas ou faltantes.");
		}else{
			System.out.println(marca);
			System.out.println(modelo);
			System.out.println(ano);
			System.out.println(cor);
			System.out.println(motor);
			exibirTudo();
		}
	}
}
