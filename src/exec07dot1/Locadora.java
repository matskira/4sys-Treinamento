package exec07dot1;

import javax.swing.JOptionPane;

/**
 * classe locadora;
 * 13/02/2020
 * @author mpoda
 * @version 0.1 
 */

public class Locadora {
	static Carro vetorCarro[];
	public int totalDeCarros = 0;

	public static void main(String[] args) {
		vetorCarro = new Carro[20];
		Carro car1 = new Carro("KOENIGGSEG", "Azul", "ECV2443", 440, "DIESEL", 2850000, false, false);
		Carro car2 = new Carro("HENESSEY VENOM TI", "Preto", "AMA4244", 435, "GASOLINA", 1200000,false,false);
		Carro car3 = new Carro("BUGATTI VENOM SPORT", "Branco", "UUU43321", 431, "GASOLINA", 2000000,false,false);
		Carro car4 = new Carro("SSC ULTIMATE", "Cinza", "UIU2786", 429, "GASOLINA", 1600000,false,false);
		Carro car5 = new Carro("FUSCA", "BRANCO", "TYU9835", 220, "FLEX", 20000,false,false);
		Carro car6 = new Carro("VW KOMBI", "PRETO", "CES9278", 180, "GASOLINA", 16000,false,false);
		Carro car7 = new Carro("GOL GTI", "CINZA", "UYY1728", 190, "FLEX", 25000,false,false);
		Carro car8 = new Carro("FIAT UNO", "BRANCO", "UTC9876", 200, "GASOLINA", 22000,false,false);
		Carro car9 = new Carro("FIAT UNO", "BRANCO", "POP1589", 200, "GASOLINA", 29000,false,false);
		// Carro car9 = new Carro("CITROEN C3","CINZA", "HUH7872", 220, "DIESEL",
		// 29000);
		Carro car10 = new Carro("FORD RANGER", "PRETO", "TTT1234", 220, "GASOLINA", 36000,false,false);
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
		for(int i=10;i<20;i++) {
			//String carro="";
			if (vetorCarro[i]==null) {
				//carro="carro"+i;
				Carro carro = new Carro("", "", "", 0, "", 0, false, true);
				vetorCarro[i]=carro;
				vetorCarro[i].vetorDisponivel=true;
	}
}
		new Locadora();
	}

	public Locadora() {
		comandoMenu();
	}

	public void comandoMenu() {
		boolean sair = false;
		try {
			while (!sair) {

				int comando = Integer.parseInt(JOptionPane
						.showInputDialog("1-PESQUISAR MODELO\n2-PESQUISAR VELOCIDADE\n3-PESQUISAR COMBUSTIVEL\n"
								+ "4-RELATORIO DECRESCENTE\n" + "5-PESQUISAR COR\n" + "6-COMPRAR CARRO\n" +"7-ADICIONAR CARRO\n"+ "9-SAIR"));
				switch (comando) {
				case 1:
					pesquisaModelo();
					break;
				case 2:
					pesquisaVelocidade();
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
					compra(escolhaModelo, escolhaCor);
					break;
				case 7:
					adicionarCarro();
					break;
				case 9:
					sair = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Comando inv�lido!", "ERROR000", JOptionPane.ERROR_MESSAGE);
					break;
				}
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ERRO FATAL!", "ERROR1", JOptionPane.ERROR_MESSAGE);
			comandoMenu();
		}

	}

	public void pesquisaModelo() {
		String messageModelo = "";
		String modeloCar = JOptionPane.showInputDialog("Digite o modelo que deseja pesquisar:").toUpperCase();
		boolean temCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(modeloCar) || !vetorCarro[i].vetorDisponivel) {
					messageModelo = (messageModelo + "Modelo do carro: " + vetorCarro[i].modelo + "\n"
							+ "Placa do carro: " + vetorCarro[i].placaDoCarro + "\n" + "Velocidade M�xima: "
							+ vetorCarro[i].velocidadeMax + "\n" + "Combust�vel: " + vetorCarro[i].combustivel + "\n"
							+ "Pre�o do carro: " + vetorCarro[i].valor + "\n" + "Cor: " + vetorCarro[i].cor + "\n\n");
					temCarro = true;
			}
		}
		if (!temCarro) {
			JOptionPane.showMessageDialog(null, "Modelo Inv�lido!", "ERROR001", JOptionPane.ERROR_MESSAGE);
		} else {
			 JOptionPane.showMessageDialog(null, messageModelo,"Informa��o", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void pesquisaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor que deseja pesquisar:").toUpperCase();
		String messageCor = "";
		boolean temCarro = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(cor)) {
				messageCor = (messageCor + "Modelo do carro: " + vetorCarro[i].modelo + "\n" + "Placa do carro: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Velocidade M�xima: " + vetorCarro[i].velocidadeMax + "\n"
						+ "Combust�vel: " + vetorCarro[i].combustivel + "\n" + "Pre�o do carro: " + vetorCarro[i].valor
						+ "\n" + "Cor: " + vetorCarro[i].cor + "\n\n");
				temCarro = true;
			}
		}
		if (temCarro == false) {
			JOptionPane.showMessageDialog(null, "Cor Inv�lido!", "ERROR001", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, messageCor);
		}
	}

	public void ordena() {
		Carro aux;
		String messageOrder = "";

		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length - 1; j++) {
				if (vetorCarro[j].valor > vetorCarro[j + 1].valor) {
					aux = vetorCarro[j];
					vetorCarro[j] = vetorCarro[j + 1];
					vetorCarro[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < vetorCarro.length; i++) {
			if(vetorCarro[i]==null) {			
				
			}else {
				if ((vetorCarro[i].vendido)||(vetorCarro[i].vetorDisponivel)) {
					
				}else {
					messageOrder = (messageOrder + "---------------------------------------" 
							+"---------------------------------------"
							+"---------------------------------------\n"
							+ " -   Modelo do carro:        " + vetorCarro[i].modelo + "  Placa do carro:        "
							+ vetorCarro[i].placaDoCarro  + "   Velocidade M�xima:        " + vetorCarro[i].velocidadeMax + 
							"   Combust�vel:        " + vetorCarro[i].combustivel +  "   Pre�o do carro:        " + vetorCarro[i].valor
							+  "   Cor:        " + vetorCarro[i].cor +"\n");
				}			
			}
		}
		JOptionPane.showMessageDialog(null, messageOrder);

	}

	public void ordena2() {
		Carro aux;
		boolean controle;

		for (int i = 0; i < vetorCarro.length; i++) {
			controle = true;
			for (int j = 0; j < vetorCarro.length - 1; j++) {
				if (vetorCarro[j].valor > vetorCarro[j + 1].valor) {
					aux = vetorCarro[j];
					vetorCarro[j] = vetorCarro[j + 1];
					vetorCarro[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
	}

	public void pesquisaCombustivel() {
		String modeloCombustivel = JOptionPane.showInputDialog("Digite o combustivel que deseja pesquisar:")
				.toUpperCase();
		boolean temCombustivel = false;
		String messageCombustivel = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(modeloCombustivel)) {
				messageCombustivel = (messageCombustivel + "Modelo do carro: " + vetorCarro[i].modelo + "\n"
						+ "Placa do carro: " + vetorCarro[i].placaDoCarro + "\n" + "Velocidade M�xima: "
						+ vetorCarro[i].velocidadeMax + "\n" + "Combust�vel: " + vetorCarro[i].combustivel + "\n"
						+ "Pre�o do carro: " + vetorCarro[i].valor + "\n" + "Cor: " + vetorCarro[i].cor + "\n\n");
				temCombustivel = true;
			}
		}
		if (temCombustivel == false) {
			JOptionPane.showMessageDialog(null, "Combust�vel Inv�lido!", "ERROR001", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, messageCombustivel);
		}

	}

	public void pesquisaVelocidade() {
		String messageVelocidade = "";
		int modeloValor = Integer
				.parseInt((JOptionPane.showInputDialog("Digite a velocidade que voc� deseja:").toUpperCase()));
		boolean temValor = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].velocidadeMax == modeloValor) {
				messageVelocidade = (messageVelocidade + "Modelo do carro: " + vetorCarro[i].modelo + "\n"
						+ "Placa do carro: " + vetorCarro[i].placaDoCarro + "\n" + "Velocidade M�xima: "
						+ vetorCarro[i].velocidadeMax + "\n" + "Combust�vel: " + vetorCarro[i].combustivel + "\n"
						+ "Pre�o do carro: " + vetorCarro[i].valor + "\n" + "Cor: " + vetorCarro[i].cor + "\n\n");
				temValor = true;
			}
		}
		if (temValor == false) {
			JOptionPane.showMessageDialog(null, "N�o temos carro com essa velocidade", "ERROR001",
					JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, messageVelocidade);
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
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(escolhaModelo) && vetorCarro[i].cor.equals(escolhaCor)) {
				message = (message + "" + i + "- Modelo do carro: " + vetorCarro[i].modelo + "\n" + "Placa do carro: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Velocidade M�xima: " + vetorCarro[i].velocidadeMax + "\n"
						+ "Combust�vel: " + vetorCarro[i].combustivel + "\n" + "Pre�o do carro: " + vetorCarro[i].valor
						+ "\n" + "Cor: " + vetorCarro[i].cor + "\n\n");
				temParaComprar = true;
			}
		}
		if (!temParaComprar) {
			JOptionPane.showMessageDialog(null, "Carro ou  cor indison�veis", "ERROR123", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, message, "Informa��o", JOptionPane.INFORMATION_MESSAGE);
			numeroProdutoEscolhido = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o n�mero do modelo escolhido para compra: "));
			precoCarro = vetorCarro[numeroProdutoEscolhido].valor;
			pegaValorUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago pelo usu�rio: "));
			if (precoCarro <= pegaValorUsuario) {
				trocoDoPagamento = pegaValorUsuario - precoCarro;
				JOptionPane.showMessageDialog(null, "Carro vendido!\n" + "Troco do pagamento: " + trocoDoPagamento,
						"Informa��o", JOptionPane.INFORMATION_MESSAGE);
				vetorCarro[numeroProdutoEscolhido].vendido = true;
			}
			if (precoCarro > pegaValorUsuario) {
				JOptionPane.showMessageDialog(null, "Valor pago pelo cliente � menor que o valor do carro!", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void adicionarCarro() {
		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i]!=null)||(vetorCarro[i].vetorDisponivel)) {
				//carro="carro"+i;
				Carro carro = new Carro(JOptionPane.showInputDialog("insira o modelo").toUpperCase(), JOptionPane.showInputDialog("insira a cor").toUpperCase(), JOptionPane.showInputDialog("insira a placa\nEX: ABC-1234").toUpperCase(),
						Integer.parseInt(JOptionPane.showInputDialog("insira a velocidade")), JOptionPane.showInputDialog("insira o tipo de combustivel\nGasolina\nAlcool\nDiesel\nFlex").toUpperCase(),
						Double.parseDouble(JOptionPane.showInputDialog("insira o pre�o")),false,false);
				vetorCarro[i]=carro;
				//cont++;
			}
			
			String decisao=JOptionPane.showInputDialog("Deseja Inserir mais um carro?").toUpperCase();
				if(decisao.equals("SIM")) {
						
				}else {
					break;
		
				
		}
			
		}		
			}
		}
