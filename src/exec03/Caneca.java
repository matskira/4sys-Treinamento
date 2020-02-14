package exec03;
/**
 * Classe Caneca extend Produto!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneca extends Produto{
	boolean estampa = true;
	String material = "Cerâmica";
	String medida = "32cm";
	
	public void exibirCaneca(){
		if (estampa == true){
		System.out.println("Possui estampa.");
		}else{
			System.out.println("Não possui estampa.");
		} 
		if ((material == null) || (medida == null)){
			System.out.println("Não foi especificado alguns dados!");
		}else{
			System.out.println(material);
			System.out.println(medida);
			exibirTudo();
		}
		
	}
}
