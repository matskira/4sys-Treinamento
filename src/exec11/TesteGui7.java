package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGui7 {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu01;
	private JMenuItem itemMenu02;
	private JPanel painelDaJanela;
	
	public void iniciaGui() {
		//instanciar
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu01 = new JMenuItem("Item 1");
		itemMenu02 = new JMenuItem("Item 2");
		painelDaJanela = (JPanel) janela.getContentPane();
		

		//acrescentar menus na barra de menus
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		menu01.add(itemMenu01);
		menu02.add(itemMenu02);
		//Configurando a ação do item de menu 1
		itemMenu01.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TesteGui4().iniciarGui();
			}
		});
		//Configurando a ação do item de menu 2
		itemMenu02.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TesteGui12().iniciaGui();
			}
		});
		//configurar painel
		painelDaJanela.setLayout(null);
		
		//configurar a tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new TesteGui7().iniciaGui();
	}
	

	
}
