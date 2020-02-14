package exec07dot1;

import javax.swing.JOptionPane;

/**
 * classe locadora;
 * @author mpoda
 * @version 0.1
 * 13/02/2020
 */

public class Locadora  {
	static Carro vetorCarro[];

	public static void main(String[] args) {
	    vetorCarro = new Carro[10];	
		Carro car1 = new Carro("KOENIGGSEG","Azul", "ECV2443", 440, "DIESEL", 2850000);
		Carro car2 = new Carro("HENESSEY VENOM TI","Preto", "AMA4244", 435, "GASOLINA", 1200000);
		Carro car3 = new Carro("BUGATTI VENOM SPORT","Branco", "UUU43321", 431, "GASOLINA", 2000000);
		Carro car4 = new Carro("SSC ULTIMATE", "Cinza","UIU2786", 429, "GASOLINA", 1600000);
		Carro car5 = new Carro("FUSCA","BRANCO", "TYU9835", 220, "FLEX", 20000);
		Carro car6 = new Carro("VW KOMBI","PRETO", "CES9278", 180, "GASOLINA", 16000);
		Carro car7 = new Carro("GOL GTI","CINZA", "UYY1728", 190, "FLEX", 25000);
		Carro car8 = new Carro("FIAT UNO","BRANCO", "UTC9876", 200, "GASOLINA", 22000);
		Carro car9 = new Carro("FIAT UNO","BRANCO", "POP1589", 200, "GASOLINA", 29000);
		//Carro car9 = new Carro("CITROEN C3","CINZA", "HUH7872", 220, "DIESEL", 29000);
		Carro car10 = new Carro("FORD RANGER","PRETO", "TTT1234", 220, "GASOLINA", 36000);	
		vetorCarro[0] = car1;
		vetorCarro[1] = car2;
		vetorCarro[2] = car3;
		vetorCarro[3] = car4;
		vetorCarro[4] = car5;
		vetorCarro[5] = car6;
		vetorCarro[6] = car7;
		vetorCarro[7] = car8;
		vetorCarro[8] = car9;
		vetorCarro[9] = car10;
		new Locadora();
	}
	public Locadora() {
		comandoMenu();
	}
	public void comandoMenu() {
		boolean sair = false;
		while(!sair) {
			int comando = Integer.parseInt(JOptionPane.showInputDialog("1-PESQUISAR MODELO\n2-PESQUISAR VELOCIDADE\n3-PESQUISAR COMBUSTIVEL\n"
					+ "4-RELATORIO DECRESCENTE\n" +"5-PESQUISAR COR\n"+ "6-COMPRAR CARRO\n" +"9-SAIR" ));	
			switch (comando) {
			case 1:
				pesquisaModelo();
				break;
			case 2:
				pesquisaValor();
				break;
			case 3:
				pesquisaCombustivel();
				break;
			case 4:
				ordena();
				break;
			case 5:
				pesquisaCor();
				break;
			case 6:
				String escolhaModelo = JOptionPane.showInputDialog("Escolha o modelo: ").toUpperCase();
				String escolhaCor = JOptionPane.showInputDialog("Escolha a cor: ").toUpperCase();
				compra(escolhaModelo,escolhaCor);
				break;
			case 9:
				sair = true;
				break;
			default:
				System.out.println("Não existe amor em SP");
				break;
			}
		}
	}
	
	public void pesquisaModelo() {

		String modeloCar = JOptionPane.showInputDialog("Digite o modelo que deseja pesquisar:").toUpperCase();
		boolean temCarro = false;
		for (int i = 0; i < vetorCarro.length;i++) {
			if(vetorCarro[i].modelo.equals(modeloCar)) {
				System.out.println("Modelo do carro: "+ vetorCarro[i].modelo);
				System.out.println("\n");
				System.out.println("Tipo de combustível: "+ vetorCarro[i].combustivel);
				System.out.println("\n");
				System.out.println("Preço: "+ vetorCarro[i].valor);
				System.out.println("-----------------------");
				temCarro = true;
			}
		}
		if(temCarro==false) {
			System.out.println("Modelo inválido!");
		}
	}

	public void pesquisaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor que deseja pesquisar:").toUpperCase();
		boolean temCarro = false;
		for (int i = 0; i < vetorCarro.length;i++) {
			if(vetorCarro[i].cor.equals(cor)) {
				System.out.println("Modelo do carro: "+ vetorCarro[i].modelo);
				System.out.println("\n");
				System.out.println("Cor: " + vetorCarro[i].cor);
				System.out.println("Tipo de combustível: "+ vetorCarro[i].combustivel);
				System.out.println("\n");
				System.out.println("Preço: "+ vetorCarro[i].valor);
				System.out.println("-----------------------");
				temCarro = true;
			}
		}
		if(temCarro==false) {
			System.out.println("Cor inválido!");
		}
	}
	
	public void ordena() {
		Carro aux;
		boolean controle;
		
		for(int i=0;i<vetorCarro.length;i++) {
			controle = true;
			for(int j = 0;j<vetorCarro.length-1;j++) {
				if(vetorCarro[j].valor > vetorCarro[j+1].valor) {
					aux=vetorCarro[j];
					vetorCarro[j]=vetorCarro[j+1];
					vetorCarro[j+1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
		for(int i =0;i<vetorCarro.length;i++) {
			System.out.println("Modelo: " + vetorCarro[i].modelo + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + 
					"\nVelocidade Maxima: " + vetorCarro[i].velocidadeMax + "\nCombustivel: " + vetorCarro[i].combustivel
					+"\nPreço: " + vetorCarro[i].valor);
		}
	}
	
	public void ordena2() {
		Carro aux;
		boolean controle;
		
		for(int i=0;i<vetorCarro.length;i++) {
			controle = true;
			for(int j = 0;j<vetorCarro.length-1;j++) {
				if(vetorCarro[j].valor > vetorCarro[j+1].valor) {
					aux=vetorCarro[j];
					vetorCarro[j]=vetorCarro[j+1];
					vetorCarro[j+1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
	}
	
	public void pesquisaCombustivel() {
		String modeloCombustivel = JOptionPane.showInputDialog("Digite o combustivel que deseja pesquisar:").toUpperCase();
		boolean temCombustivel = false;
		for (int i = 0; i < vetorCarro.length;i++) {
			if(vetorCarro[i].combustivel.equals(modeloCombustivel)) {
				System.out.println("Modelo do carro: "+ vetorCarro[i].modelo);
				System.out.println("\n");
				System.out.println("Cor: " + vetorCarro[i].cor);
				System.out.println("Tipo de combustível: "+ vetorCarro[i].combustivel);
				System.out.println("\n");
				System.out.println("Preço: "+ vetorCarro[i].valor);
				System.out.println("-----------------------");
				temCombustivel = true;
			}
		}
		if(temCombustivel == false) {
			System.out.println("Combustível inválido!");
		}
	}
	
	public void pesquisaValor() {
		int modeloValor = Integer.parseInt((JOptionPane.showInputDialog("Digite o valor que deseja pesquisar:").toUpperCase()));
		boolean temValor = false;
		for (int i = 0; i < vetorCarro.length;i++) {
			if(vetorCarro[i].valor == modeloValor) {
				System.out.println("Modelo do carro: "+ vetorCarro[i].modelo);
				System.out.println("\n");
				System.out.println("Cor: " + vetorCarro[i].cor);
				System.out.println("Tipo de combustível: "+ vetorCarro[i].combustivel);
				System.out.println("\n");
				System.out.println("Preço: "+ vetorCarro[i].valor);
				System.out.println("-----------------------");
				temValor = true;
			}
		}
		if(temValor == false) {
			System.out.println("Valor inválido");
		}
	}
	
	public void compra(String escolhaModelo, String escolhaCor) {
		
		ordena2();
		boolean temParaComprar = false;
		String message = "";
		int numeroProdutoEscolhido = 0;
		double precoCarro = 0;
		double pegaValorUsuario = 0;
		double trocoDoPagamento = 0;
		for(int i = 0; i < vetorCarro.length; i++) {
			if(vetorCarro[i].modelo.equals(escolhaModelo) && vetorCarro[i].cor.equals(escolhaCor)) {
				message = (message +"" +i+"- Modelo do carro: "+vetorCarro[i].modelo + "\n" + "Placa do carro: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade Máxima: " + vetorCarro[i].velocidadeMax + "\n"+"Combustível: " 
						+ vetorCarro[i].combustivel + "\n" + "Preço do carro: " + 
						vetorCarro[i].valor + "\n\n"  );
				temParaComprar = true;	
			}			
		}
		JOptionPane.showMessageDialog(null,message,"Informação", JOptionPane.INFORMATION_MESSAGE);
		numeroProdutoEscolhido = Integer.parseInt("Digite o número do modelo escolhido para compra: ");
		
		precoCarro =  vetorCarro[numeroProdutoEscolhido].valor;
		pegaValorUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago pelo usuário: "));
		if (precoCarro <= pegaValorUsuario) {
			trocoDoPagamento = pegaValorUsuario - precoCarro;
			JOptionPane.showMessageDialog(null, "Carro vendido!\n"+"Troco do pagamento: " + trocoDoPagamento,"Informação", JOptionPane.INFORMATION_MESSAGE);
		}
		if (precoCarro > pegaValorUsuario) {
			JOptionPane.showMessageDialog(null, "Valor pago pelo cliente é menor que o valor do carro!","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		if(!temParaComprar) {
			System.out.println("Carro indisponível");
		}	
	}
	
	
	
}
	
	
	
	
	
	
	

