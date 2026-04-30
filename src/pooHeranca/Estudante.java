package pooHeranca;

public class Estudante extends Pessoa {  //Classe derivada da Pessoa ou Classe filha

	
	
		//Atributos
	    private String matricula;
	    private String curso;
	      
	    
	    //Metodo construtor
		public Estudante(String nome, int idade, String email, String matricula, String curso) {
			super(nome, idade, email); //super => é o metodo construtor da classe mae
			//passando as caracteristicas de 'Pessoa'para a filha ler
			this.matricula = matricula;
			this.curso = curso;
		}
		
		
		//Metodos de acesso (Get- Pega / Set- coloca; analisa)
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
	}
	

