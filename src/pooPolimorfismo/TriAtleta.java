package pooPolimorfismo;


//por causa do extends (herda) algo de alguem, no caso "pessoa", entao passaria para a "filha"
public class TriAtleta extends Pessoa implements ICiclista { 

	
		
		int competicoes;

			//Metodos Construtores
		public TriAtleta(String nome, int idade, int competicoes) {
			super(nome, idade);
			this.competicoes = competicoes;
		}
		
		
		public int getCompeticoes() {
			return competicoes;
		}

		public void setCompeticoes(int competicoes) {
			this.competicoes = competicoes;
		}
		
		public void competicoesConcluidas() {
			System.out.println("Competições Concluidas: " + this.competicoes);
		}
		
		
		//Polimorfismo de sobrecarga (sobrecarga de metodo)
		public void competicoesConcluidas(int numero) {
			System.out.println("Competições Concluidas: " + numero);
		}
		
		
		//Polimorfismo de sobrescrita (sobrescrita de metodo)
		public void visualizar() {
			super.visualizar();
			System.out.println("Competições: " + this.competicoes);
			
		}
		
		//Metodos implementados das interfaces
		public void pedalar () {
			System.out.println("Estou pedalando...");
		}


		@Override //Anotação - Etiqueta de dados/ informações
		public String aquecer() {
			return "Estou me aquecendo";
		}
	}

