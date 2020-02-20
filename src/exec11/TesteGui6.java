package exec11;
/**
 * Programa para aprender a usar ComboBox;
 * @author mpoda
 */

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui6 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamento = {"Monitor","Teclado","Mouse","Impressora","Modem"};
	
	public void iniciaGui() {
		//instanciar 
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamento);
		
		
		//configurando comboBox
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//configuração painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		//configuração da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
	}
	
		public static void main(String[] args) {
			new TesteGui6().iniciaGui();
		}
}
