package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {
	 
	//Declarar as variaveis de referencia;
	private static JFrame janela;
	private static JButton botao;
	
	
	public static void main(String[] args) {
		//Criar uma instancia(novaTEla)
		janela = new JFrame("TelaBIXO");
		//Criar um botao(instancia)
		botao = new JButton("CLIQUE AQUI!");
		//Adicionar o botao ao janela
		janela.getContentPane().add(botao);
		
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		//configurar a visibilidade da tela(true/false)
		janela.setVisible(true);
		//informar que a tela não tem layout pré-definido
		janela.getContentPane().setLayout(null);
		
		
		
		
	}

}
