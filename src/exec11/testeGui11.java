package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class testeGui11 {

	private JFrame janela;
	private JTabbedPane painelComAbas;
	private JPanel painelDaJanela;
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	
	public void iniciaGui() {
		//criar as instancias
		janela = new JFrame("eXemplo painel com abas");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelComAbas = new JTabbedPane();
		aba1 = new JPanel();
		aba2 = new JPanel();
		aba3 = new JPanel();
		
		
		
		//configurar e adicionar as abas
		painelComAbas.addTab("Aba1", aba1);
		painelComAbas.addTab("Aba2", aba2);
		painelComAbas.addTab("Aba3", aba3);
		painelComAbas.setBounds(14, 21, 342, 200)	;
		
		//configurar o texto das abas
		aba1.add(new JLabel("Primeia aba"));
		aba2.add(new JLabel("Segunda aba"));
		aba3.add(new JLabel("Terceira aba"));
		
		//config do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);
		
		//config da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
		
	}
	public static void main(String[] args) {
		new testeGui11().iniciaGui();
	}
	
}
