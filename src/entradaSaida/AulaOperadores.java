package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		// Variaveis
		float celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		
		// Entrada de dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat(); // é importante colocar a virgula entre os numeros
		
		// Processamneto
		fahrenheit = celsius * 1.8f + 32;
		
		// Saida 
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
	}

}
