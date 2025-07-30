package area3Retangulos;

public class Retangulo {
	
	//declaração da váriável altura e largura
	public double alt;
	public double larg;
	
	//cálculo da área do retângulo
	public double calcArea() {
		return (larg * alt);
	}

	@Override
	public String toString() {
		return "Retangulo [alt=" + alt + ", larg=" + larg + "]";
	}
	
	

}
