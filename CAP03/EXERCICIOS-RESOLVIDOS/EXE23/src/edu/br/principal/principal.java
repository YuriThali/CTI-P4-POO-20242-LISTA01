package edu.br.principal;

import java.util.Scanner;

public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float num, i, f, a;
		
		System.out.println("Digite um número: ");
		num= sc.nextFloat();
		
		i= (int)num;
	    
		f= num;
		
		a= Math.round(num);
		
		System.out.println("Número inteiro: " + i);
		
		System.out.println("Número fracionário: " + f);
		
		System.out.println("Número arredondado: " + a);
		
	}

}
