package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, anonasc, anoatual, idade2050;
		
		System.out.println("Digite o ano de nascimento: ");
		anonasc = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		anoatual = sc.nextInt();
		idade = anoatual - anonasc;
		idade2050 = 2050 - anonasc;
		System.out.println("A idade atual da pessoa é: " + idade);
		System.out.println("A idade da pessoa em 2050 será igual á: " + idade2050);
		
		
		
		
		
		
		
	

	}

}
