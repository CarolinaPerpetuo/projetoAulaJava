package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		//Instanciamento
		Carro c1 = new Carro("Kombi", 4, 4, "Modelo VW"); //c1 é um objeto
		
		
		
		// c1.marca = "Kombi";
		// c1.portas = 4;
		
		
		// c1.setMarca("Kombi");
		// c1.setPortas(4);
		
		
		 c1.locomover();
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Quantidade de portas: " + c1.getPortas());
		
		System.out.println(c1.parar());
	}

}
