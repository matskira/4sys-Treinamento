package exec11;
/**
 * Programa que faz uma checkbox
 * @author mpoda
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui12 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;
	
	public void iniciaGui() {
	
		//criar as instancias
		janela = new JFrame();
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();
		
		//configuração das label escolhe
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma do pagamento: ");
		lblEscolha.setBounds(42, 15, 200, 18);
		
		//configurações das label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta: ");
		lblResposta.setBounds(42, 230, 300, 18);
		
		//configurações do check box Cartão de crédito
		cbCC.setText("Cartão de crédito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);
		//configurações do check box Depósito Bancário
		cbDB.setText("Depósito Bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);
		//configurações do check box Boleto Bancário
		cbBB.setText("Boleto Bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);
		
		//configuração do botão
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);
		
		//ação do botão
		btnResposta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
				
			}
		});
		
		//adicionar componentes no painel
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);
		
		//configurações da tela]
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
	public void verificaSelecionado() {
		// verificar qual radio button foi selecionado
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}
		//troca a cor da fonte para vermelha
		if(!resposta.contentEquals("")) { //tratamento;
			lblResposta.setText(resposta);
		}else {
			lblResposta.setText("Resposta:");
		}
		resposta = "";
	}
	public static void main(String[] args) {
		new TesteGui12().iniciaGui();
	}
}
