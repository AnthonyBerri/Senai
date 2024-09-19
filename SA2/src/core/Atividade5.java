package core;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);  // Create a Scanner object

	    String[] lista = { "a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"};
	    
	    System.out.println("Quantos itens deseja inserir na lista?[Max: 20]");
	    
	    int itensDaLista = input.nextInt();
	    
	    int total = itensDaLista;
	    
	    System.out.println("Insira os itens abaixo: ");
	    
	    for(int i = 0; i <= total; i++) {
	    	
		String listaInput = input.nextLine();
	    lista[i+1] = listaInput;
		
	    }
	    
	    System.out.println("Lista enumerada:");
	    
	    for(int i = 1; i <= total; i++) {
	    	
	    	System.out.println((i) + " - " + lista[i+1]);
	    	
	    }

	}

}
