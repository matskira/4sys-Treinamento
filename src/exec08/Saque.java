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
			//int Nota1Contador = 0;
			
			int Total = 0;
			
			int ValorSacado = valor;
			
			String Message = "";
			if((ValorSacado % 2 == 0) || (ValorSacado % 5 == 0) || (ValorSacado != 0)) {
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
				if (ValorSacado == 1) {
					JOptionPane.showMessageDialog(null, "Não possuímos notas para realizar esse saque","info",JOptionPane.ERROR_MESSAGE);
				}else {
//				while (ValorSacado == 1)
//				{
//					ValorSacado = ValorSacado - 1;
//					Nota1Contador++;
//				}
				Total = Nota50Contador+Nota20Contador+Nota10Contador+Nota5Contador+Nota2Contador;
				Message = (Message + "Notas de 50 sacadas: " + Nota50Contador + ".\n" + "Notas de 20 sacadas: "
				+ Nota20Contador + ".\n"+"Notas de 10 sacadas: " + Nota10Contador + ".\n"+"Notas de 5 sacadas: "
						+ Nota5Contador + ".\n" + "Notas de 2 sacadas: " + Nota2Contador + ".\n\n\n" + "Total de Notas: "+Total);
				JOptionPane.showMessageDialog(null, Message,"Info",JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("Notas de 1 sacadas: " + Nota1Contador + ".");
				}

			}
			
			}
			
	}