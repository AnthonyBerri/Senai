package core;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int[] total = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int[] valores = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int maiorNumero = 0, menorNumero = 0;
		
		for (int i = 0; i < 20; i++) {
			
			Scanner media = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Insira os valores para fazer a media:");

		    valores[i] = media.nextInt();
		    total[i] = valores[i];
		}

		for (int i = 0; i < 19; i++) {
			
			total[i+1] = total[i] + total[i+1];
			
		}
		
		for(int ponteiro = 0; ponteiro < 20; ponteiro++) {
			if(maiorNumero == 0) {
				maiorNumero = valores[ponteiro];
			}
			if(maiorNumero < valores[ponteiro]) {
			
				maiorNumero = valores[ponteiro];
		
			}else {
			
				maiorNumero = maiorNumero + 0;
		
			}
		}
		
		for(int ponteiro = 0; ponteiro < 20; ponteiro++) {
			if(menorNumero == 0) {
				menorNumero = valores[ponteiro];
			}
			if(menorNumero > valores[ponteiro]) {
			
				menorNumero = valores[ponteiro];
		
			}else {
			
				menorNumero = menorNumero + 0;
				
			}
		}
		
		double media = total[19] / 20;
		
		System.out.println("Media dos valores:" + media);
		System.out.println("Maior numero: " + maiorNumero);
		System.out.println("Menor numero: " + menorNumero);
	}

}
