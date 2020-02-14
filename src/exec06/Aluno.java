package exec06;
//import java.time.Year;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Aluno {
	String nome ;
	String dataNascimento = "23/10/2000" ;
	String curso ;
	String cidade ;
	
	public Aluno(){
		processar();
	}
	
	public Aluno(String nome, String dataNascimento, String curso, String cidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
	}
	
	public int separaDatas() {
		String data2 = this.dataNascimento;
		String datas2[] = data2.split("/");		
		String dia1 = datas2[0];
		String mes1 = datas2[1];
		String ano1 = datas2[2];
		String numeroTotalInvertido1 = (ano1+mes1+dia1);
		int numeroTotalInvertido1Inteiro = Integer.parseInt(numeroTotalInvertido1);	
		return numeroTotalInvertido1Inteiro;
	}
	public int separaDatasAtual() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data = formatador.format(date);
		String data3 = data;
		String datas3[] = data3.split("/");		
		String dia2 = datas3[0];
		String mes2 = datas3[1];
		String ano2 = datas3[2];
		String numeroTotalInvertido2 = (ano2+mes2+dia2);
		int numertoTotalInvertido2Inteiro = Integer.parseInt(numeroTotalInvertido2);
		return numertoTotalInvertido2Inteiro;
	}
	public int anoAtual() {
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
		Date date = new Date();
		String dataAno = formatador.format(date);
		String numeroTotalInvertido2 = (dataAno);
		int numertoTotalInvertido2Inteiro = Integer.parseInt(numeroTotalInvertido2);
		//System.out.println(dataAno);
		return numertoTotalInvertido2Inteiro;
	}
	public int mesAtual() {

		SimpleDateFormat formatador = new SimpleDateFormat("MM");
		Date date = new Date();
		String dataMes = formatador.format(date);
		String numeroTotalInvertido2 = (dataMes);
		int numertoTotalInvertido2Inteiro = Integer.parseInt(numeroTotalInvertido2);
		//System.out.println(dataMes);
		return numertoTotalInvertido2Inteiro;
	}
	public int diaAtual() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd");
		Date date = new Date();
		String dataDia = formatador.format(date);
		String numeroTotalInvertido2 = (dataDia);
		int numertoTotalInvertido2Inteiro = Integer.parseInt(numeroTotalInvertido2);
		System.out.println(dataDia);
		return numertoTotalInvertido2Inteiro;
	}
	public int separaDatasAno() {
		String data2 = this.dataNascimento;
		String datas2[] = data2.split("/");		
		String ano1 = datas2[2];
		String numeroTotalInvertido1 = (ano1);
		int numeroTotalInvertido1Inteiro = Integer.parseInt(numeroTotalInvertido1);	
		//System.out.println(numeroTotalInvertido1Inteiro);
		return numeroTotalInvertido1Inteiro;
	}
	public int separaDatasMes() {
		String data2 = this.dataNascimento;
		String datas2[] = data2.split("/");		
		String mes1 = datas2[1];
		String numeroTotalInvertido1 = (mes1);
		int numeroTotalInvertido1Inteiro = Integer.parseInt(numeroTotalInvertido1);	
		System.out.println(numeroTotalInvertido1Inteiro);
		return numeroTotalInvertido1Inteiro;
	}
	public int separaDatasDias() {
		String data2 = this.dataNascimento;
		String datas2[] = data2.split("/");		
		String dias1 = datas2[0];
		String numeroTotalInvertido1 = (dias1);
		int numeroTotalInvertido1Inteiro = Integer.parseInt(numeroTotalInvertido1);	
		//System.out.println(numeroTotalInvertido1Inteiro);
		return numeroTotalInvertido1Inteiro;
	}
	public void calculoDeDias() {
		int a = separaDatas();
		int b = separaDatasAtual();
		//System.out.println(a);
		//System.out.println(b);
		int diasTotais = (b-a);
		System.out.println("Sua data em dias: "+diasTotais);
	}
	public void calculoFinal() {
		int anoAtual = anoAtual();
		int anoNiver = separaDatasAno();
		int anoTotal = anoAtual - anoNiver;
		int mesAtual = mesAtual();
		int mesNiver = separaDatasMes();
		int mesTotal = mesAtual - mesNiver;
		//System.out.println(mesTotal);
		if(mesTotal < 0) {
			anoTotal = anoTotal - 1;
			System.out.println("Sua idade é: " + anoTotal);	
		}if(mesTotal == 0) {
			int diaAtual = diaAtual();
			int diaNiver = separaDatasDias();
			int diaTotal = diaAtual - diaNiver;
			if(diaTotal < 0) {
				anoTotal = anoTotal - 1;
				System.out.println("Sua idade é " + anoTotal);
			}
			if(diaTotal == 0) {
				System.out.println("Parabéns! Hoje é seu aniversário de " + anoTotal+ " anos");
			}
		}
	}
	
	public void processar() {
		System.out.println(nome);
		System.out.println(dataNascimento);
		System.out.println(curso);
		System.out.println(cidade);
		calculoDeDias();
		calculoFinal();
	}
}
