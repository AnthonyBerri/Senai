package core;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner horasInput = new Scanner(System.in); 
	    System.out.println("Insira as horas que quer converter para segundos: ");

	    Double horas = horasInput.nextDouble();  
	    System.out.println("Em " + horas + " horas tem " + horas * 3600 + " segundos.");  
		
	}

}
