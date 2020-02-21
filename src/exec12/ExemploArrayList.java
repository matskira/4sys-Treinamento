package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
		//criar um objeto array list
		List<String> arrayList = new ArrayList<String>();
		//adicionar elementos ao final da lista, usamos o m�todo add
		arrayList.add("Elemento n�1");
		arrayList.add("Elemento n�2");
		arrayList.add("Elemento n�3");

		System.out.println("Posi��o 1 contem: " + arrayList.get(0));
		System.out.println("Posi��o 1 contem: " + arrayList.get(1));
		System.out.println("Posi��o 1 contem: " + arrayList.get(2));
		
		for (String s: arrayList) {
			System.out.println(s);
		}
		//tamb�m podemos adicionar um elemento numa posi��o qualquer
		arrayList.add(1,"elemento n�1,5\n");
		
		for (String s : arrayList) {
			System.out.println(s);
		}
		//obter o tamanho da lista
		System.out.println("\nO tamanho da lista �: " + arrayList.size() + "\n");
		
		//podemos ver um determinado valor na lista
		if(arrayList.contains("Elemento n�1")) {
			System.out.println("ELEMENTO 1 EXISTE");
		}else {
			System.out.println("N�O EXISTE");
		}
		
		int indice = arrayList.indexOf("Elemento n�1");
		System.out.println("\nO indice do elemento 1 �: " + indice);
		
		//remover um elemento da lista
		System.out.println("\nRemovendo Elemento 1,5");
		arrayList.remove("elemento n�1,5\n");
		System.out.println("Lista atualizada");
		
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		//remover com base no indice - ultimo registro
		System.out.println("\nRemovendo o ultimo elemento");
		arrayList.remove(arrayList.size() - 1);
		System.out.println("Lista atualizada");
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		//adicionando elementos na lista 
		arrayList.add("elemento n�1");
		arrayList.add("elemento n�3");
		arrayList.add("elemento n�5");
		arrayList.add("elemento n�8");
		System.out.println("\n Lista com elementos adicionados");
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		//ordenar array list
		Collections.sort(arrayList);
		System.out.println("\n Lista com elementos adicionados");
		for (String s : arrayList) {
			System.out.println(s);
		}	
		
		//criando uma lista de objetos
		List<Filme> arrayListFilme = new ArrayList<Filme>();
		
		//criando 3 filmes
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo de Conduto");
		
		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Matrix");
		
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Era do gelo");
		
		if(filme1.equals(filme2)) {
			System.out.println("\nFilmes Iguais\n");
		}else {
			System.out.println("\nFilmes diferentes\n");
		}
		
		//adicionar na lista os filmes instanciados
		arrayListFilme.add(filme1);
		arrayListFilme.add(filme2);
		arrayListFilme.add(filme3);
		
		//exibindo a lista de filmes
		for (Filme f : arrayListFilme) {
			System.out.println(f);
		}
		
		//ordenar filme
//		System.out.println("Lista Ordenada");
//		Collections.sort((List<T>).arrayListFilme);
//		for (Filme f : arrayListDilmw) {
//			System.out.println(f);
//		}
//		
		
		
		
		
		
		
		
	}
}
