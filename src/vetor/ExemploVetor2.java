package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		int vetorNumeros[] = new int[3];
		Scanner leia = new Scanner(System.in);
		
		//o vetor vai acessar a casa [0]
		
		//pedindo e guardando o numero no vetor
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[indice] = leia.nextInt();
			// numero = leia.nextInt();
		}
		
			//mostrar itens do vetor
		for (int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]);
		}
		
		System.out.println("Tamanho do Vetor: " + vetorNumeros.length);
		
		
	}

}
