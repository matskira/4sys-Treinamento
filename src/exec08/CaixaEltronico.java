package exec08;

import javax.swing.JOptionPane;

/**
 *  Contador de cedulas
 *  @author matskira
 *	@version 0.1
 */
public class CaixaEltronico {
	static int valor;

	public static void calcular(int valor){
		int[] cedulas = {50,20,10,5,2};
		
		for(int i = 0; i < cedulas.length; i++){
			if(valor > 3000) {
				JOptionPane.showMessageDialog(null, "Valor de saque limite diario eh de 3000!");
				break;
			}
			else {
				
				if( valor >= cedulas[i] ){
					int resultado = valor/cedulas[i];
					int resultadoResto = valor % cedulas[i];
					String message1 = (resultado + "notas de "+cedulas[i]);
					if (resultadoResto>0) {
						resultadoResto = resultadoResto / cedulas[i];
						System.out.println(message1 + resultadoResto);
					}
				
					
					
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		calcular (valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja sacar:")));
	}
	
	
}
