package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	
	public static void main(String[] args) {
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Linha 1");
			gravador.println("Linha 2");
			gravador.println("Linha 3");
			gravador.println("Linha 4");
			gravador.println("Linha 5");
			gravador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
