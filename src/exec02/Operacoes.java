package exec02;
/**
 * Testando operadores!
 * @author mpoda
 * @since 11/02/2020
 * @version 0.1
 */

public class Operacoes {
	public static void main(String[] args) {
		System.out.print("********************************************\n\n\n");
		System.out.println("MOSTRA RESULTADO DE OPERAÇÕES 0.1\n\n\n");
		System.out.println("*******************************************\n\n\n");
		String operador;
		double numero1 = 5;
		double numero2 = 13;
		System.out.println("Os números usados são: "+numero1+" e "+numero2);
		double resultadoConta;
		operador = "soma";
		resultadoConta = numero1 + numero2;
		System.out.println("O resultado da "+operador+" é igual a "+resultadoConta);
		//exemplo subtração;
		operador="subtração";
		resultadoConta = numero1 - numero2;
		System.out.println("O resultado da "+operador+" é igual a "+resultadoConta);
		//exemplo multiplicação
		operador = "multiplicação";
		resultadoConta = numero1*numero2;
		System.out.println("O resultado da "+operador+" é igual a "+resultadoConta);
		//exemplo divisão
		operador = "divisão";
		resultadoConta = numero1 / numero2;
		System.out.println("O resultado da "+operador+" é igual a "+resultadoConta);
		//exemplo de módulo;
        //Módulo mostra o resto da divisão;
		operador = "módulo";
		resultadoConta = numero1 % numero2;
		System.out.println("O resultado do "+operador+" é igual a "+resultadoConta);
		
	}
}
