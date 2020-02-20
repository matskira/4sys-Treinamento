package exec11;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui9 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painelDaJanela1;
	private JPanel painelDaJanela2;
	private JPanel painelDaJanela3;
	private JPanel painelDaJanela4;
	
	public void iniciaGui() {
		JFrame janela = new JFrame();
		painelDaJanela = (JPanel)janela.getContentPane();
		painelDaJanela1 = new JPanel();
		painelDaJanela2 = new JPanel();
		painelDaJanela3 = new JPanel();
		painelDaJanela4 = new JPanel();
		
		painelDaJanela1.setBounds(4, 6, 200, 100);
		painelDaJanela1.setLayout(null);
		painelDaJanela1.setBorder(BorderFactory.createEtchedBorder());
		
		
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelDaJanela1);
		
		janela.setSize(422, 246);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
		
	}
	
	
}
