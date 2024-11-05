package edu.br.principal;

import java.util.Scanner;

public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float sal, perc, aumento, novosal;
		
		System.out.println("Digite o valor do seu salário: ");
		sal= sc.nextFloat();
		System.out.println("Digite o percentual de aumento %: ");
		perc= sc.nextFloat();
		
		aumento= sal*perc/100;
		System.out.println("Seu aumento será de R$" + aumento);
		
		novosal= sal+aumento;
		System.out.println("Seu novo salário será R$" +novosal);

	}

}
