package exec09;

public class Trim {
	
	public static void main(String[] args) {
		String um = "Olá ";
		String dois = "Mundo ";
		System.out.println("Antes do trim: " + um + dois+ ".");
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois do Trim: " + um + dois + ".");
	}
}
