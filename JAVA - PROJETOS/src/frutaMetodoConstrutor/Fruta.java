package frutaMetodoConstrutor;

public class Fruta {

	public String nome;
	public String cor;
	public String sabor;
	public double peso;
	
	public Fruta() {
		
	}
	
	public Fruta(String nome, String cor, String sabor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.sabor = sabor;
		this.peso = peso;

}
	
	public Fruta(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;

}
	
	public Fruta(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	
	public Fruta(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fruta [nome=" + nome + ", cor=" + cor + ", sabor=" + sabor + ", peso=" + peso + "g]";
	}
}
