package entradaSaida;

import java.util.Scanner;   // importando o arquivo scanner para demtro da minha Classe

public class AulaScanner {

	public static void main(String[] args) {
		
		// Declarando variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		// Entrada de dados
		System.out.println("Digite o seu nome: ");
		
		// Processamneto
		nome = leia.nextLine();
		
		// Saida de dados
		System.out.println("Bom dia,  " + nome + "!");  // ( + ) concatenar
		
		
	}

}
