package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, s;
		
		System.out.println("Digite a N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a N2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a N3: ");
		n3 = sc.nextDouble();
		System.out.println("Digite a N4: ");
		n4 = sc.nextDouble();
		s = n1 + n2 + n3 + n4;
		System.out.println("A soma dos números é: " + s);
		
		

		
	}

}
