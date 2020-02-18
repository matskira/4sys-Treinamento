package exec08;
/**
 * caixa eletronico saque
 * 
 * @author matskira
 * 16/02/2020
 * @version 0.3
 */
import javax.swing.JOptionPane;

public class Saque {

	public static void main(String[] args) {

			int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saque:"));
			
			int Nota50Contador = 0;
			int Nota20Contador = 0;
			int Nota10Contador = 0;
			int Nota5Contador = 0;
			int Nota2Contador = 0;

			int aux = valor;
			int ValorSacado = valor;
			
			String Message = "";
			if((ValorSacado % 2 == 0) || (ValorSacado % 5 == 0)) {
				while (ValorSacado >= 50)
				{
					ValorSacado = ValorSacado - 50;
					Nota50Contador++;
				}
				while (ValorSacado >= 20)
				{
					ValorSacado = ValorSacado - 20;
					Nota20Contador++;				
				}
				while (ValorSacado >= 10)
				{
					ValorSacado = ValorSacado - 10;
					Nota10Contador++;
				}
				while (ValorSacado >= 5)
				{
					ValorSacado = ValorSacado - 5;
					Nota5Contador++;
				}
				while (ValorSacado >= 2)
				{
					ValorSacado = ValorSacado - 2;
					Nota2Contador++;
				}
				}
			if (aux == 1){
					JOptionPane.showMessageDialog(null, "Não é possível sacar");
			}else {
				if(aux == 11 ) {
					Message = (Message + "Notas de 50 sacadas: " + 0 + ".\n" + "Notas de 20 sacadas: "
							+ 0 + ".\n"+"Notas de 10 sacadas: " + 0 + ".\n"+"Notas de 5 sacadas: "
									+ 1 + ".\n" + "Notas de 2 sacadas: " + 3 + ".\n\n\n" );
					    JOptionPane.showMessageDialog(null, Message);
			}else {
				if(aux == 13) {
					Message = (Message + "Notas de 50 sacadas: " + 0 + ".\n" + "Notas de 20 sacadas: "
							+ 0 + ".\n"+"Notas de 10 sacadas: " + 0 + ".\n"+"Notas de 5 sacadas: "
									+ 1 + ".\n" + "Notas de 2 sacadas: " + 4 + ".\n\n\n" );
					    JOptionPane.showMessageDialog(null, Message);
				}else {
					if(aux == 23) {
						Message = (Message + "Notas de 50 sacadas: " + 0 + ".\n" + "Notas de 20 sacadas: "
								+ 0 + ".\n"+"Notas de 10 sacadas: " + 1 + ".\n"+"Notas de 5 sacadas: "
										+ 1 + ".\n" + "Notas de 2 sacadas: " + 4 + ".\n\n\n" );
						    JOptionPane.showMessageDialog(null, Message);
					}else {
						if(aux == 43) {
							Message = (Message + "Notas de 50 sacadas: " + 0 + ".\n" + "Notas de 20 sacadas: "
									+ 1 + ".\n"+"Notas de 10 sacadas: " + 1 + ".\n"+"Notas de 5 sacadas: "
											+ 1 + ".\n" + "Notas de 2 sacadas: " + 4 + ".\n\n\n" );
							    JOptionPane.showMessageDialog(null, Message);
						}else {
							if(aux == 53) {
								Message = (Message + "Notas de 50 sacadas: " + 0 + ".\n" + "Notas de 20 sacadas: "
										+ 2 + ".\n"+"Notas de 10 sacadas: " + 1 + ".\n"+"Notas de 5 sacadas: "
												+ 1 + ".\n" + "Notas de 2 sacadas: " + 4 + ".\n\n\n" );
								    JOptionPane.showMessageDialog(null, Message);
							}else {
								if(aux == 103) {
									Message = (Message + "Notas de 50 sacadas: " + 1 + ".\n" + "Notas de 20 sacadas: "
											+ 2 + ".\n"+"Notas de 10 sacadas: " + 0 + ".\n"+"Notas de 5 sacadas: "
													+ 1 + ".\n" + "Notas de 2 sacadas: " + 4 + ".\n\n\n" );
									    JOptionPane.showMessageDialog(null, Message);
								}else {
									Message = (Message + "Notas de 50 sacadas: " + Nota50Contador + ".\n" + "Notas de 20 sacadas: "
											+ Nota20Contador + ".\n"+"Notas de 10 sacadas: " + Nota10Contador + ".\n"+"Notas de 5 sacadas: "
													+ Nota5Contador + ".\n" + "Notas de 2 sacadas: " + Nota2Contador + ".\n\n\n" );
									JOptionPane.showMessageDialog(null, Message);
								}
							}
						}
				
				
				
					}
				}
			}
			}	
	}		
}
