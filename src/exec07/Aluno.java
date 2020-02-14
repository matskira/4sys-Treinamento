package exec07;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Aluno {
	String nome;
	String dataNascimento = "23/10/2000";
	String curso;
	String cidade;

	public Aluno() {
	}

	public Aluno(String nome, String dataNascimento, String curso, String cidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
		allData();
		calculaIdadeGeral();
	}

	// Metodo para calcular atraves da data atual e do aniversario;

	void calculaIdadeGeral() {

		String dt = this.dataNascimento;
		String dateParts[] = dt.split("/");
		String month2 = dateParts[1];
		String day2 = dateParts[0];
		String year2 = dateParts[2];
		int monthNiverInt = Integer.parseInt(month2);
		int dayNiverInt = Integer.parseInt(day2);
		int yearNiverInt = Integer.parseInt(year2);
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int year = cal.get(Calendar.YEAR);
		LocalDate hoje = LocalDate.of(year, month, day);
		LocalDate aniversario = LocalDate.of(yearNiverInt, monthNiverInt, dayNiverInt);
		Period period = Period.between(aniversario, hoje);
		long diasTotais = ChronoUnit.DAYS.between(aniversario, hoje);
		System.out.println("Sua idade: " + period.getYears() + " anos  " + period.getMonths() + " meses  "
				+ period.getDays() + "  dias");
		System.out.println("Sua idade em dias: " + diasTotais);
	}

	void allData() {
		System.out.println("Nome: " + nome);
		System.out.println("Sua data de nascimento: " + dataNascimento);
		System.out.println("Seu curso: " + curso);
		System.out.println("Sua cidade: " + cidade);
	}
}
