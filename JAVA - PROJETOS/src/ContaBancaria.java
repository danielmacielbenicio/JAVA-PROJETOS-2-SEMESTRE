package banco;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem vindo ao banco PedMais");
		System.out.println("ESCOLHA A OPERAÇÃO [1] SAQUE [2] DEPOSITO [3] CONSULTA");
		
		int opcoes = sc.nextInt();
		String escolha;
		
		switch (opcoes) {
		
		case 1:
		System.out.println("Você escolheu a opção de saque - Digite o quanto quer sacar:");
		sc.next();
		case 2:
		sc.next();
		case 3:
		sc.nextDouble();
		
		}
	}
	

}
