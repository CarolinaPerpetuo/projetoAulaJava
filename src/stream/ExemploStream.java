package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//iremos criar uma stream
		List <String> estadoEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase())       //esta pendindo para analisar cada item e deixar ele maiusculo; é uma operação intermediaria
				.collect(Collectors.toList());   //operação terminal. finalização
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count();
				
				
		System.out.println("Estador em Maiusculo: " + estadoEmMaiusculo);
		System.out.println("\nEstados Unicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados Unicos: " + quantidadeDeEstados);
		
		System.out.println("\nColeção/Dados Inicial: " + estados);

	}

}
