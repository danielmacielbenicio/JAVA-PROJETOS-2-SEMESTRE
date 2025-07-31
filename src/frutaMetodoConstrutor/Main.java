package frutaMetodoConstrutor;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fruta fruta = new Fruta("Banana", "Amarela", "Doce", 500);
		System.out.println(fruta.toString());
		
		sc.close();
		}
	}



