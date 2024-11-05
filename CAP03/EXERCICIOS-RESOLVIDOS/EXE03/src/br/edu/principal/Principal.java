package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int peso1, peso2, peso3, soma4;
		Double n1, n2, n3, media, soma1, soma2, soma3;
		
		System.out.println("Nota 1: ");
		n1 = ia.nextDouble();
		System.out.println("Nota 2: ");
		n2 = ia.nextDouble();
		System.out.println("Nota 3: ");
		n3 = ia.nextDouble();
		System.out.println("Peso 1: ");
		peso1 = ia.nextInt();
		System.out.println("Peso 2: ");
		peso2 = ia.nextInt();
		System.out.println("Peso 3: ");
		peso3 = ia.nextInt();
		
		soma1 = (n1 * peso1);
		soma2 = (n2 * peso2);
		soma3 = (n3 * peso3);
		soma4 = (peso1 + peso2 + peso3);
		media = (soma1 + soma2 + soma3)/soma4;
		
		System.out.println("A média foi" + media);

	}

}
