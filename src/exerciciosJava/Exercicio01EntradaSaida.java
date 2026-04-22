package exerciciosJava;

import java.util.Scanner;

public class Exercicio01EntradaSaida {

	

	public static void main(String[] args) {
	
		float Salario , Abono; 
		Scanner leia = new Scanner(System.in);
	
		
		System.out.println("Insira o Salario: ");
		Salario = leia.nextFloat();
		
		System.out.println("Insira o Abono: ");
		Abono = leia.nextFloat();
		
		Salario = Salario + Abono; 
		
		System.out.println("O Novo Salario é: " + Salario);

		
		
		
	

	}

}
