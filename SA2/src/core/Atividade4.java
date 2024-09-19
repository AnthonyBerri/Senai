package core;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner tamanhoLinha = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Qual o tamanho que deseja para a linha?");

	    int linha = tamanhoLinha.nextInt();  // Read user input
	    System.out.println("Aqui está sua linha!");
	    
	    int i = 0;
	    
	    for(i = 0; i < linha; i++) {
	    	
	    	System.out.print("_");  	
	    
	    }
	}

}
