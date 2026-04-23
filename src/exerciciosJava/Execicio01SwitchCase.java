package exerciciosJava;

import java.util.Scanner;

public class Execicio01SwitchCase {

	public static void main(String[] args) {
		
		int operacao;
		float saldo = 1000;
		float valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a operação desejada (1- Saldo, 2- Saque, 3- Depósito)");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1: 
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ " + saldo);
			break;
			
		case 2:
			System.out.println("Digite o valor do saque: ");
			valor = leia.nextFloat();
			
			System.out.println("Operação - Saque");
			
			if (valor > saldo) {
				System.out.println("Saldo insuficiente.");
			}
			else {
				saldo = saldo - valor;
				System.out.println("Novo Saldo: R$ " + saldo);
			}
			break;
			
		case 3:
			System.out.println("Digite o valor do deposito: ");
			valor = leia.nextFloat();
			
			System.out.println("Operação - Deposito");
			
			saldo = saldo + valor;
			System.out.println("Novo Saldo: R$ " + saldo);
			break;
			
		default:
			System.out.println("Operação invalida!");
		
		}
		
		

	 }

}
