package exec11;
/**
 * Adicionar senha no registro
 * @author mpoda
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TesteGui8 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lblSenha;
	private JPasswordField jpwSenha;
	
	public void iniciaGui() {
		//criar as instancias
		janela = new JFrame();
		painelDaJanela = (JPanel)janela.getContentPane();
		lblSenha = new JLabel();
		jpwSenha = new JPasswordField();
		
		//configurar a label
		lblSenha.setText("Senha");
		lblSenha.setBounds(10, 40, 40, 20); 
		
		//configurar o campo da senha;
		jpwSenha.setBounds(60, 40, 100, 20);
		
		//configurar o painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblSenha);
		painelDaJanela.add(jpwSenha);
		
		//configurar a tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
				
	}
	public static void main(String[] args) {
		new TesteGui8().iniciaGui();
	}
}
