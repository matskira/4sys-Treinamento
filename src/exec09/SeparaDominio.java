package exec09;

import javax.swing.JOptionPane;

public class SeparaDominio {
	
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog(null, "Digite o seu e-mail: ", "Validador de e-mail"
				,3);
		int cont = email.indexOf("@"); //pega onde o @ ta
		if (cont > 0) {
			System.out.println("Posição do @ " + cont);
			String dominio = email.substring(cont + 1);
			System.out.println("Dominio do e-mail " + dominio);
			String usuario = email.substring(0,cont);
			System.out.println("Usuário do e-mail: " + usuario);
			
		}
		
		//String email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
		
		
	}
}
