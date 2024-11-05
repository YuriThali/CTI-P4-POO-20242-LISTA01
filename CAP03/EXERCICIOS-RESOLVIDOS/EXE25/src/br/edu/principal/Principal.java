package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, quantidade;
		
		System.out.println("Digite o custo do espetáculo: ");
		custo = sc.nextDouble();
		System.out.println("Digite o preço do convite: ");
		convite = sc.nextDouble();
		quantidade = custo / convite;
		System.out.println("A quantidade de convites que devem ser vendidos é: " + quantidade);
	
	}

}
