package exerciciosJava;

import java.util.Scanner;

public class Exercicio01If {

	public static void main(String[] args) {
		
		
		float numeroA, numeroB, numeroC, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero A: " );
		numeroA = leia.nextFloat();
		
		System.out.println("Digite o numero B: " );
		numeroB = leia.nextFloat();
		
		System.out.println("Digite o numero C: " );
		numeroC = leia.nextFloat();
		
		resultado = (numeroA + numeroB);
		
		if (resultado > numeroC) {
			System.out.println("A soma de A e B é maior que C.");	
		}
		if (resultado < numeroC) {
			System.out.println("A soma de A e B é menor que C.");
		}
		if  (resultado == numeroC) {
			System.out.println("A soma de A e B é igual a C.");
		}

	}

}
