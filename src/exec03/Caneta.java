package exec03;
/**
 * Classe Caneta extend Produto!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneta extends Produto{
	String cor = "azul";
	String formato = "ponta fina";
	String marca = "BIC";
	
	public void exibirCaneta(){
		if((cor == null) || (formato == null) || (marca == null) ){
			System.out.println("Está faltando informações!");
		}else{
			System.out.println(cor);
			System.out.println(formato);
			System.out.println(marca);
			exibirTudo();
		}
	}
}
