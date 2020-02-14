package exec03;
/**
 * Classe Computador extend Produto!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */
public class Computador extends Produto {
	String processador = "Intel i5 10th";
	String memoria = "Kingston DDR3 8Gb Ram";
	String tela = "BenQ 144hz";
	String hd = "Soundisk 1tb";
	String placaVideo = "Nvidia Geforce RTX 2080";
	
	public void exibirComputador(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placaVideo);
		exibirTudo();
	}

}
