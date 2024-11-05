package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float dep, taxa, rend, total;
		
		System.out.println("Valor do depósito: ");
		dep= sc.nextFloat();
		System.out.println("Valor da taxa: ");
		taxa= sc.nextFloat();
		
		rend= dep*taxa/100;
		total= dep+rend;
		
		System.out.println("O valor total será R$" + total);

	}

}
