package pctEx04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {5, 12, 8, 7, 2, 11, 4, 9};
	
		int contador = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
			if (vetor[i] % 2 == 0) {
                contador++;
            }
        }
		
		System.out.println("Número dos pares encontrados: " + contador);
		
		
		
		
		
		
		
		
		
		
		
	}

}
