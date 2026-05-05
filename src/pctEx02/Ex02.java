package pctEx02;



public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 0;
		int vetor[] = new int [5];
		
		vetor [0] = 10;
		vetor [1] = 20;
		vetor [2] = 30;
		vetor [3] = 40;
		vetor [4] = 50;
		
        for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			soma += vetor[i];
		    
		}
        System.out.println("A soma dos valores é igual a: " + (vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]) );
		
		
		
		
		
		
		
	}

}
