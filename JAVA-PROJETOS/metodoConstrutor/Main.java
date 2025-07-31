package metodoConstrutor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa("Danilo, 19");
		
		p1.nome ="Danilo";
		p1.idade = 19;
		p1.peso = 74;
		p1.genero = "masculino";
		p1.alt = 1.70;
		System.out.println(p1.toString());
		
		System.out.printf("O IMC de " + p1.nome + " é : %.2f %n " , p1.calculoImc());
		
		sc.close();

	}

}

