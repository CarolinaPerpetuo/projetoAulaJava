package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);   //resultado numerico = 7
		
		System.out.println("O primeiro resultado: " + resultado);
		mensagem();
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info();
	}
	
	       //procedimento - logica do metodo
	public static int somar(int num1, int num2) {   //assinatura do metodo
		 //logica do metodo
		return num1 + num2;
	}
	
	public static void mensagem() {
		System.out.println("Esse metodo não tem retorno (void)");
	}
	
	
	public static void saudacao(String msg) {
		System.out.println(msg);
	}
}
