package Extra;
import java.util.Calendar;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TesteAluno {
	
	public static void main(String[] args) {
		//Data fornecida;
		String dataCompleta = JOptionPane.showInputDialog("Digite sua data de nascimento:");
		String data [] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		//Data do sistema;
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int year = cal.get(Calendar.YEAR);
		
		DateTime dataInicial = new DateTime(ano,mes,dia,0,0);
		DateTime dataFinal = new DateTime(year,month,day,0,0);
		
		int dias= Days.daysBetween(dataInicial, dataFinal).getDays();
		System.out.println(dias+"\n"+dias);
	}
}
