package Extra;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;
public class TesteUou {

	public static void main(String[] args) {
		String dataNascimentoString = JOptionPane.showInputDialog("Digite sua data de nascimento:");
		String dataAtualString = "02/13/2020";
		
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);
		LocalDate dataAtual = LocalDate.parse(dataAtualString);
		
		double diasTotal = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
		System.out.println(diasTotal);
	}	
}
