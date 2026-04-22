package exerciciosJava;

import java.util.Scanner;

public class Exercicio02EntradaSaida {

	public static void main(String[] args) {
		
		float Nota1, Nota2, Nota3, Nota4, MediaFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira as Notas: ");
		Nota1 = leia.nextFloat();
		Nota2 = leia.nextFloat();
		Nota3 = leia.nextFloat();
		Nota4 = leia.nextFloat();
		
		MediaFinal = (Nota1 + Nota2 + Nota3 + Nota4) /4;
		
		System.out.println("Media Final é: " + MediaFinal);

	}

}
