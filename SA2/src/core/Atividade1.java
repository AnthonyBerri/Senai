package core;

public class Atividade1 {

	public static void main(String[] args) {
		
		int[] L = {5,7,2,9,4,1,3};
		
		int[] lCrescente = {5,7,2,9,4,1,3};
		
		int[] lDecrescente = {5,7,2,9,4,1,3};
		
		int tamanhoLista = L.length;
		
		int ponteiro = 0, maiorNumero = 0, menorNumero = 0;
		
		int[] total = {5,7,2,9,4,1,3};
		
		//Descobrir o maior numero
		for(ponteiro = 0; ponteiro < 7; ponteiro++) {
			if(maiorNumero == 0) {
				maiorNumero = L[ponteiro];
			}
			if(maiorNumero < L[ponteiro]) {
			
				maiorNumero = L[ponteiro];
		
			}else {
			
				maiorNumero = maiorNumero + 0;
		
			}
		}
		
		
		//Descobrir o menor numero
		for(ponteiro = 0; ponteiro < 7; ponteiro++) {
			if(menorNumero == 0) {
				menorNumero = L[ponteiro];
			}
			if(menorNumero > L[ponteiro]) {
			
				menorNumero = L[ponteiro];
		
			}else {
			
				menorNumero = menorNumero + 0;
		
			}
		}
		
		
		//somar todos os numeros
		for(ponteiro = 0; ponteiro < 6; ponteiro++) {
			
			total[ponteiro+1] = total[ponteiro] + total[ponteiro+1];
			
		}
		
		System.out.println("Tamanho da lista: " + tamanhoLista);
		
		System.out.println("Maior numero do vetor: " + maiorNumero);
		
		System.out.println("Menor numero do vetor: " + menorNumero);

		System.out.println("Soma dos valores: " + total[6]);
		
		System.out.println("Vetor em ordem crescente: ");
		
		for(int i = 0; i < lCrescente.length; i++) {
			for(int j = 0; j < (lCrescente.length - i - 1); j++) {
				if(lCrescente[j] > lCrescente[j+1]) {
					
					int temp = lCrescente[j];
					
					lCrescente[j] = lCrescente[j+1];
					
					lCrescente[j+1] = temp;
				
				}
			}
		}
		
		for(int i = 0; i < lCrescente.length; i++) {
			
			System.out.print(lCrescente[i] + " ");
			
		}
	
		System.out.println("\nVetor em ordem decrescente: ");
		
		for(int i = 0; i < lDecrescente.length; i++) {
			for(int j = 0; j < (lDecrescente.length - i - 1); j++) {
				if(lDecrescente[j] < lDecrescente[j+1]) {
					
					int temp = lDecrescente[j];
					
					lDecrescente[j] = lDecrescente[j+1];
					
					lDecrescente[j+1] = temp;
				
				}
			}
		}
		
		for(int i = 0; i < lDecrescente.length; i++) {
			
			System.out.print(lDecrescente[i] + " ");
			
		}
	}
	
}
