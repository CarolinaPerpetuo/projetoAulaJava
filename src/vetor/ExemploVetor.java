package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		
		   // os numeros começam do  0,          1,               2,        3         e        4
		String vetorCachorros[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		
		for (int numero = 0; numero < 5; numero++) {
			System.out.println((numero + 1) + "º elemento: " + vetorCachorros[numero]);
			
		}
		
	}

}
