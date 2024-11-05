package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quadrado, cubo, raiz2, raiz3;
		
		System.out.println("Digite um número positivo e maior que zero: ");
		num = sc.nextDouble();
		if (num > 0) {
			quadrado = Math.pow(num,2);
		    cubo = Math.pow(num,3);
		    raiz2 = Math.sqrt(num);
		    raiz3 = Math.cbrt(num);
		    System.out.println("O número ao quadrado é: " + quadrado);
	     	System.out.println("O número ao cubo é: " + cubo);
		    System.out.println("A raiz quadrada do número é: " + raiz2);
	    	System.out.println("A raiz cúbica do número é: " + raiz3);
	 	}
		else {
			System.out.println("O número digitado é inválido");
		}
		
		
		

	}

}
