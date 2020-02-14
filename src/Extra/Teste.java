package Extra;

public class Teste {
	public static void ordena(int elementos[]){  
	     int cont1, cont2,aux;  
	         for(cont1 =0; cont1<10; cont1++){  
	             for(cont2 =0; cont2 <9; cont2++){  
	                if(elementos[cont2]> elementos[cont2+1]){  
	                     aux = elementos[cont2];  
	                     elementos[cont2] = elementos[cont2+1];  
	                     elementos[cont2+1] = aux;  
	                 }  
	             }  
	         }              
	}      

}
