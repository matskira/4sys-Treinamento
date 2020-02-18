package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {
	//Declarar os componentes;
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo; //LUGAR ONDE O USUARIO DIGITA
	private JTextArea area;   //LUGAR ONDE FICA AS INFORMAÇÕES	
	
	public TesteGui3 () {
		iniciaGui();
	}
	public void iniciaGui() {
		//criar a janela
		janela = new JFrame();
		//criar a area de texto
		area = new JTextArea();
		//Criar o primeiro botao
		botao1 = new JButton("Clique aqui");
		//Adicionar o metodo desenvolvido na classe texto;
		botao1.addActionListener(new TextoListener());	
		//Criar o segundo botao
		botao2 = new JButton("troca cor");
		//Adicionar o metodo desenvolvido em Cor;
		botao2.addActionListener(new CorListener());
		//Criar o campo para digita texto
		campo = new JTextField();
		//Adicionar o metodo desenvolvido na classe texto;
		campo.addActionListener(new TextoListener());
		//Adicionar o bota 1 ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		//Adicionar o bota 2 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		//Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		//Adicionar JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		//Configurar o tamanho da tela
		janela.setSize(300,300);
		//Configurar a visibilidade da tela
		janela.setVisible(true);
	}		
	public class TextoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			area.append(campo.getText() + "\n");
			campo.setText("");
			
		}
		
	}	
	public class CorListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//se o fundo da JTextArea for neutro troca para preta
			if(area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			}else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
		}
		
	}
	

	public static void main(String[] args) {
		new TesteGui3();
	}
}
