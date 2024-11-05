package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float area, raio;
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio= sc.nextFloat();
		
		area= (float) (3.1415*raio);
		
		System.out.println("A área do círculo é de: " + area);
		

	}

}
