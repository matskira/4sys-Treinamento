package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {
		//definir a tela e suas caracteristicas
		JFrame janela =  new JFrame();
		janela.setTitle("Titulo Tela");
		janela.setSize(300, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		
		
		//definir o compontente Jbutton (botao)
		JButton botao = new JButton();
		botao.setText("CLIQUE AQUI");
		botao.setBounds(10, 10, 100, 20);
		
		//definir o compontente JLabel de rotulo
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome: ");
		lblNome.setBounds(10, 40, 40, 20);
		
		
		
		//definir o campo de texto (JTextField)
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
		
		//adicionar os componentes na tela
		janela.getContentPane().add(botao);		
		janela.getContentPane().add(lblNome);		
		janela.getContentPane().add(txtNome);
		
		//informar a visibilidade da tela
		janela.setVisible(true);
		
	}
}
