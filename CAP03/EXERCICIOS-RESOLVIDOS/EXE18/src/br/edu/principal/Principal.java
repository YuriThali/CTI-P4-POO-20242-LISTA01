package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double peso_saco, racao1, racao2, totalfinal;
		System.out.println("Peso da ração: ");
		peso_saco = ia.nextDouble();
		System.out.println("Quantidade de ração do primeiro gato: ");
		racao1 = ia.nextDouble();
		System.out.println("Quantidade de ração pro segundo gato: ");
		racao2 = ia.nextDouble();
		
		racao1 = racao1/1000;
		racao2 = racao2/1000;
		totalfinal = peso_saco - 5 *(racao1 + racao2);
		System.out.println("Restará apenas" + totalfinal);
	}

}
