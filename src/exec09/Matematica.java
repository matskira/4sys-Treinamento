package exec09;

public class Matematica {

	public static void main(String[] args) {
		
		double x = 10, y=20.3, z=-30;
		//Valor Absoluto;
		double abs = Math.abs(z);
		System.out.println(abs);
		//Retorna maior inteiro
		double ceil = Math.ceil(y);
		System.out.println(ceil);
		//Retorna menor inteiro
		double floor = Math.floor(y);
		System.out.println(floor);
		//Retorna o log;
		double log = Math.log(x);
		System.out.println(log);
		//Maior valor entre os parametros;
		double max = Math.max(x, y);
		System.out.println(max);
		//Menor valor entre os parametros;
		double min = Math.min(x, y);
		System.out.println(min);
		//Mostra potencia;
		double pow = Math.pow(x, 2);
		System.out.println(pow);
		//Mostra a raiz;
		double sqrt = Math.sqrt(x);
		System.out.println(sqrt);
		//Mostra o cosseno;
		double cos = Math.cos(y);
		double sin = Math.sin(y);
		double tan = Math.tan(y);
		System.out.println(cos);
		System.out.println(sin);
		System.out.println(tan);
	}
}
