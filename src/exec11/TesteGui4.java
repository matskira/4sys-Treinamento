package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;



public class TesteGui4 {
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;
	
	public void iniciarGui() {
		//criar as instancias
		janela = new JFrame("Exemplo Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel)janela.getContentPane();
	
		//criar objeto do grupo de botões
		grpRadio = new ButtonGroup();
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);
		
		//configurações da Label
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil: ");
		lblEscolha.setBounds(82, 18, 230, 18);
		
		//configuração do botão solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);
		//configuração do botão casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);
		//configuração do botão viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);
		//configuração do botão desquitado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);
		//configurações do botão 
		btnVerificar.setText("verificar");
		btnVerificar.setBounds(126, 176, 83, 28);
		
		//adicionar ação
		
		btnVerificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				verificaSelecionado();
			}
		});
		
		
		
		//configuração Painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);
		
		//configurações da janela;
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //botao fechar
		janela.setSize(300, 273);
		janela.setVisible(true);
		
												
	}//fimDoMetodo iniciaGui
	
	public void verificaSelecionado() {
		// verificar qual radio button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		//troca a cor da fonte para vermelha
		if(!resposta.contentEquals("")) { //tratamento;
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
		}
		resposta = "";
	}
	public static void main(String[] args) {
		new TesteGui4().iniciarGui();
	}
}//fim da classe


