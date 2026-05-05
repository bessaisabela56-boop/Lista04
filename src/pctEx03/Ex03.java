package pctEx03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maior = 0;
		int vetor[] = new int [5];
		
		vetor [0] = 15;
		vetor [1] = 04;
		vetor [2] = 250;
		vetor [3] = 25;
		vetor [4] = 100;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
        for (int i = 0; i < vetor.length; i++) {
		
        	if (vetor[i] > maior) {
        		maior = vetor[i] ;
        		
        	}
			
		    
		}
		
        System.out.println("O número maior encontrado é: " + maior);
		
		
		
		
		
		
		
	}

}
