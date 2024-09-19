package core;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner media = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Insira os valores para fazer a media:");

	    Double valor1 = media.nextDouble();  // Read user input
	    Double valor2 = media.nextDouble();
	    Double valor3 = media.nextDouble();
	    Double valor4 = media.nextDouble();
	    
	    Double total = valor1 + valor2 + valor3 + valor4;
	    
	    Double fazerMedia = total / 4;
		
	    if(fazerMedia > 1) {
	    	System.out.println("Positivo.");
	    } else {
	    	System.out.println("Negativo.");
	    }
	}

}
