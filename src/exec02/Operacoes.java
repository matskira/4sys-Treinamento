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
		System.out.println("MOSTRA RESULTADO DE OPERA��ES 0.1\n\n\n");
		System.out.println("*******************************************\n\n\n");
		String operador;
		double numero1 = 5;
		double numero2 = 13;
		System.out.println("Os n�meros usados s�o: "+numero1+" e "+numero2);
		double resultadoConta;
		operador = "soma";
		resultadoConta = numero1 + numero2;
		System.out.println("O resultado da "+operador+" � igual a "+resultadoConta);
		//exemplo subtra��o;
		operador="subtra��o";
		resultadoConta = numero1 - numero2;
		System.out.println("O resultado da "+operador+" � igual a "+resultadoConta);
		//exemplo multiplica��o
		operador = "multiplica��o";
		resultadoConta = numero1*numero2;
		System.out.println("O resultado da "+operador+" � igual a "+resultadoConta);
		//exemplo divis�o
		operador = "divis�o";
		resultadoConta = numero1 / numero2;
		System.out.println("O resultado da "+operador+" � igual a "+resultadoConta);
		//exemplo de m�dulo;
        //M�dulo mostra o resto da divis�o;
		operador = "m�dulo";
		resultadoConta = numero1 % numero2;
		System.out.println("O resultado do "+operador+" � igual a "+resultadoConta);
		
	}
}
