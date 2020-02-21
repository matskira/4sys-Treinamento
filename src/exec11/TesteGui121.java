package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui121 {

	private JFrame janela;
	private JList list;
	private JLabel label;
	private JPanel painelDaJanela;
	private JScrollPane scroll;
	private String[] diaSemana = {"Domingo", "Segunda", "Terça", "Quarta",
			"Quinta","Sexta","Sabado"};
	
	public void iniciaGui() {//inicia metodo inicia gui
		
		//criar instancias
		janela = new JFrame("Exemplo de lista");
		painelDaJanela = (JPanel) janela.getContentPane();
		list = new JList(diaSemana);
		label = new JLabel("CTRL para multiseleções", JLabel.CENTER);
		scroll = new JScrollPane(list);
		
		//configurar lista
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //n deixa nada 
		list.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				label.setText((String)list.getSelectedValue());
			}
		});
		
		
		
		//config scroll
		scroll.setBounds(10, 60, 300, 90);
		
		//atrib rotulo
		label.setOpaque(true);
		label.setBackground(Color.lightGray);
		label.setForeground(Color.BLACK);
		label.setBounds(10, 10, 300, 30);
		
		//configuração do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);
		
		//config da janela
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
	}//fim metodo inicia gui
	
	public static void main(String[] args) {
		new TesteGui121().iniciaGui();
	}
	
	
}
