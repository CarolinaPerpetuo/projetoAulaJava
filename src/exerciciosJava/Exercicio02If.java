package exerciciosJava;

import java.util.Scanner;

public class Exercicio02If {

	public static void main(String[] args) {
		
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: " );
		numero = leia.nextInt();
		
		// veificação se é par ou impar
		String tipo;
		if (numero % 2 == 0) {
			tipo = "par";
		}
		else {
			tipo = "impar";
		}
		
		
		// verificando se é positivo ou negativo
		String sinal;
		if (numero >= 0) {
			sinal = "positivo";
		}
		else {
			sinal = "negativo";
		}
		
		System.out.println("O numero " + numero + " é " + tipo + " e " + sinal);
		
	 }


	}


