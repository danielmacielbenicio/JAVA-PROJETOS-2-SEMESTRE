package area3Retangulos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			
		//Adicionar prompt para perguntar valor
		System.out.printf("DIGITE OS VALORES DO " + (i+1) + " RETÂNGULO %n");	
		Retangulo ret = new Retangulo();
		
		//Requisitar as informações necessárias para o cálculo da área
		System.out.println("Digite a largura do retângulo: ");
		ret.larg = sc.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		ret.alt = sc.nextDouble();	
		
		//Exibir o cálculo da área
		System.out.printf("O cálculo da área do seu retângulo é de: %.2f %n" , ret.calcArea());
		System.out.println("");
		
		}
		sc.close();
	}
}
