package metodoConstrutor;

public class Pessoa {

	public String nome;
	public int idade;
	public String genero;
	public double peso;
	public double alt;
	
	public Pessoa(String nome, int idade, String genero, double peso, double alt) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.alt = alt;
	}

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public double calculoImc() {
		return peso / (alt * alt);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + ", genero= " + genero + ", peso= " + peso + "]";
	}
}
