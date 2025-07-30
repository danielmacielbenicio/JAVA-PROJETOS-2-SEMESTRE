package aula1_POO_teste;

public class Pessoa {

	public String nome;
	public int idade;
	public String genero;
	public double peso;
	public double alt;

	public double calculoImc() {
		return peso / (alt * alt);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + ", genero= " + genero + ", peso= " + peso + "]";
	}
}
