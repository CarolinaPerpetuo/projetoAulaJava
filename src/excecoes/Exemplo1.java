package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	
		
		
		
			static Scanner ler = new Scanner(System.in);
			
			public static void main(String[] args) {
				
				int dividendo = 0;
				int divisor = 0;
					
				try {
					System.out.println("Digite o Dividendo: ");
					dividendo = ler.nextInt();
							
					System.out.println("Digite o Divisor: ");
					divisor = ler.nextInt();
							
					divide(dividendo, divisor);
					
				} 
				catch (InputMismatchException e) { 
					System.err.println("\nExceção: " + e);// o "e" nessa classe utiliza tudo que esta dentro do try
					System.out.println("\nDigite valores numericos!");
				} 
				catch (ArithmeticException e) {
					System.out.println("\nExceção: " + e);
					System.out.println("\nDigite numeros inteiros e positivos!");
				}
				finally {
					System.out.println("\nSempre serei executado!"); //nem sempre é necessario utilizar o finally
				}
				
			}


			public static void divide(int dividendo, int divisor) {
				System.out.println("Divisão = " + (dividendo / divisor));
			}
}


		 
		


