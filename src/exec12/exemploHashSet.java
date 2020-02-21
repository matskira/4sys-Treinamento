package exec12;

import java.util.HashSet;

public class exemploHashSet {

	public static void main(String[] args) {
		HashSet<String> listaString = new HashSet<String>();
		
		listaString.add("A Era do Gelo");
		listaString.add("Madagascar");
		listaString.add("Fuga das galinhas");
		listaString.add("Ta dando onda");
		System.out.println(listaString);
		
		
		HashSet<Integer> listaInt = new HashSet<Integer>();
		listaInt.add(0);
		listaInt.add(1);
		listaInt.add(1);		
		listaInt.add(2);
		listaInt.add(3);
		listaInt.add(4);
		System.out.println(listaInt);
	}
}
